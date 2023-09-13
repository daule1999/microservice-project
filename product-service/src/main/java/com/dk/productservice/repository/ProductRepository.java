package com.dk.productservice.repository;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dk.productservice.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
	
	public static final MongoTemplate mongoTemplate = null;

}
