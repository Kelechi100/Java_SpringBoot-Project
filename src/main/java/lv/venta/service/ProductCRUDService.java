package lv.venta.service;

import java.util.ArrayList;

import lv.venta.model.Product;

public interface ProductCRUDService {
	
	//CRUD  create retrieve ipdate delete
	
	public abstract void create(String title, String description, float price, int quantity);
	
	// retrieve all
	public abstract ArrayList<Product> retrieveAll() throws Exception;
	
	// retrieve all
	public abstract Product retrievById(int id ) throws Exception;
	// update
	public abstract void updateById(int id,String title, String description, float price, int quantity ) throws Exception;
	
	// delete
	public abstract void deleteById(int id) throws Exception;

}
