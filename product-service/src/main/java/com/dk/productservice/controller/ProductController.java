package com.dk.productservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dk.productservice.dto.ProductRequest;
import com.dk.productservice.dto.ProductResponse;
import com.dk.productservice.model.Product;
import com.dk.productservice.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping
	@RequestMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
		return productService.createProduct(productRequest);
	}
	
	@GetMapping
	@RequestMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<ProductResponse> getAllProduct() {
		return productService.getAllProduct();
	}


}
