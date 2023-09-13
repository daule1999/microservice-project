package com.dk.productservice.model;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Document("customer")
@AllArgsConstructor
@Builder
@Data
public class Customer {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Id
	public String id;

	public String firstName;
	public String lastName;

	public Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

}
