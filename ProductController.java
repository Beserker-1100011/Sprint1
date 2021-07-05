package com.abc.techstore.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.techstore.entity.Product;
import com.abc.techstore.service.ProductService;
@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
private ProductService productService;

//@GetMapping("/all")
//public List<Product> getAllProducts(){
//	List<Product> products=productService.fetchAllProducts();
//	return products;
//	
//}
@PostMapping("/save")
public void createProduct( @RequestBody Product product) {
productService.saveProduct(product);
}
//@GetMapping("/{id}")
//public Product getProductById(@PathVariable("id") int productId) {
//	Product product=productService.fetchProductById(productId);
//	return product;
//}
@GetMapping("/{id}")
public ResponseEntity<?> getProductById(@PathVariable("id") int productId) {
    Product product =productService.fetchProductById(productId);
    return new ResponseEntity<>(product,HttpStatus.OK);
}
//@GetMapping("/byName/{productName}")
//public ResponseEntity<?>getProductById(@PathVariable("productName")String productName){
//	Optional<Product>optionalProduct=productService.fetchProductByName(productName);
//	ResponseEntity<?> responseEntity  = null;
//	if(optionalProduct.isPresent()) {
//		responseEntity=new ResponseEntity<>(optionalProduct.get(),HttpStatus.OK);
//	}
//	if(optionalProduct.isEmpty()) {
//		responseEntity=new ResponseEntity<>("Product not found with name",HttpStatus.OK);
//	}
//	return responseEntity;
//}
       
//@PostMapping("/save")
//public ResponseEntity<?> createProduct(@RequestBody Product product) {       
//    productService.saveProduct(product);
//    ResponseEntity<String> responseEntity = new ResponseEntity<>("Product saved Successfully",HttpStatus.CREATED);
//    return responseEntity;
//}
//@GetMapping("/premium")
//public ResponseEntity<List<Product>>getQualityProducts(){
//	 List<Product>products=productService.findAllPremiumProducts();
//	 return new ResponseEntity<>(products,HttpStatus.OK);
//}
}