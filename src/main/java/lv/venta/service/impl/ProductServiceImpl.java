package lv.venta.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import lv.venta.model.Product;
import lv.venta.service.IProductFilteringService;
import lv.venta.service.ProductCRUDService;

@Service

public class ProductServiceImpl implements ProductCRUDService, IProductFilteringService{

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product retrievById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateById(int id, String title, String description, float price, int quantity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
