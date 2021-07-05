package com.abc.techstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.techstore.entity.Product;
import com.abc.techstore.exception.ProductAlreadyExistingException;
import com.abc.techstore.exception.ProductNotAvailableException;
import com.abc.techstore.repository.ProductRepository;


	@Service
	public class ProductServiceImpl implements ProductService {
		
		@Autowired
		private ProductRepository productRepository;	

		
		@Override
		public void saveProduct(Product product) throws ProductAlreadyExistingException {
			
		Optional<Product> productObj = productRepository.findById(product.getProductId());
			if(productObj.isPresent()) {
				throw new ProductAlreadyExistingException("Product already existing with id: "+product.getProductId());
			}
			else {
				productRepository.save(product);
			}
			
		}


		@Override
		public Product fetchProductById(int productId) {
			Optional<Product> optionalProduct = productRepository.findById(productId);	
			if(optionalProduct.isEmpty()) {
				throw new ProductNotAvailableException("Product not existing with id: "+productId);
			}
				
			return optionalProduct.get();
		}


//		@Override
//		public Product fetchProductByName(String productName) {
//			// TODO Auto-generated method stub
//			return null;
//		}


		

	}

