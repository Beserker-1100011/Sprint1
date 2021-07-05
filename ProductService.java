package com.abc.techstore.service;

import com.abc.techstore.entity.Product;

public interface ProductService {
	public void saveProduct(Product product) ;
	 public Product fetchProductById(int productId);
	// public Product fetchProductByName(String productName);
}