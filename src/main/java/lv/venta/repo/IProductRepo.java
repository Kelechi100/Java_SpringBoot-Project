package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Product;

public interface IProductRepo extends CrudRepository<Product,  Integer>{

	Product findByTitleAndDescriptionAndPrice(String title, String description, float price);

	ArrayList<Product> findByQuantityLessthan(int threshold);
	
	
	
	
	

}
