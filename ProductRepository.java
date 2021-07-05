package com.abc.techstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abc.techstore.entity.Product;



public interface ProductRepository extends JpaRepository<Product,Integer> {

	public Optional<Product> findByProductName(String productName);
	public Optional<Product> findByProductId(int productId);


	
}