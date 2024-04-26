package lv.venta.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lv.venta.model.Product;
import lv.venta.repo.IProductRepo;
import lv.venta.service.IProductFilteringService;
import lv.venta.service.ProductCRUDService;

@Service

public class ProductServiceImpl implements ProductCRUDService, IProductFilteringService{

	@Autowired
	private IProductRepo productRepo;
	
	@Override
	public ArrayList<Product> filterByQuantityThreshold(int threshold) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> filterByPriceBetween(float minPrice, float maxPrice) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(String title, String description, float price, int quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Product> retrieveAll() throws Exception {
		if(productRepo.count() == 0) throw new Exception("Product table is empty");
		ArrayList<Product> result = (ArrayList<Product>) productRepo.findAll();
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public Product retrievById(int id) throws Exception {
		if(id <= 0) throw new Exception("Id should be positive");
		
		if(productRepo.existsById(id)) return productRepo.findById(id).get();
		// TODO Auto-generated method stub
		
		throw new Exception("Product with id ( " + id +  ") is not in the Product table");
	}

	@Override
	public void updateById(int id, String title, String description, float price, int quantity) throws Exception {
		if(title == null|| description == null || price < 0 || quantity < 0 )
			throw new Exception("Problem with input paramaters");
		Product productForUpdating = retrievById(id);
		productForUpdating.setTitle(title);
		productForUpdating.setDescription(description);
		productForUpdating.setPrice(price);
		productForUpdating.setQuantity(quantity); 
		
		productRepo.save(productForUpdating);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) throws Exception {
		Product ProductForDeleting = retrievById(id);
		productRepo.delete(ProductForDeleting);
		// TODO Auto-generated method stub
		
	}
	
	

}
