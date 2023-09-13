package com.dk.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.productservice.dto.ProductRequest;
import com.dk.productservice.dto.ProductResponse;
import com.dk.productservice.model.Product;
import com.dk.productservice.model.Product.ProductBuilder;
import com.dk.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
	
	@Autowired
	private final ProductRepository productRepository = null;

	public ProductResponse createProduct(ProductRequest productRequest) {
		Product newProduct=Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
		
		Product product=productRepository.save(newProduct);		
		return mapToProductResponse(product);
	}

	public List<ProductResponse> getAllProduct() {
		List<Product> products=productRepository.findAll();
		return products.stream().map(product -> mapToProductResponse(product)).toList();
	}

	private ProductResponse mapToProductResponse(Product product) {
		log.info("Product is Saved", product.toString());
		return ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())
				.build();
	}

}
