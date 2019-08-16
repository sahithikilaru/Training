package com.visa.prj.dao;

import java.util.List;

import com.visa.prj.entity.Product;

public interface ProductDao {
	
	List<Product> getproducts();
	Product getproduct(int id);
	int addproduct(Product p);

}
