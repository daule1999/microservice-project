package com.dk.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

//	@Autowired
//    CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

//	public void run(String... args) throws Exception {
//
//	    repository.deleteAll();
//
//	    // save a couple of customers
//	    repository.save(new Customer("Alice", "Smith"));
//	    repository.save(new Customer("Bob", "Smith"));
//
//	    // fetch all customers
//	    System.out.println("Customers found with findAll():");
//	    System.out.println("-------------------------------");
//	    for (Customer customer : repository.findAll()) {
//	      System.out.println(customer);
//	    }
//	    System.out.println();
//
//	    // fetch an individual customer
//	    System.out.println("Customer found with findByFirstName('Alice'):");
//	    System.out.println("--------------------------------");
//	    System.out.println(repository.findByFirstName("Alice"));
//
//	    System.out.println("Customers found with findByLastName('Smith'):");
//	    System.out.println("--------------------------------");
//	    for (Customer customer : repository.findByLastName("Smith")) {
//	      System.out.println(customer);
//	    }
//
//	  }

}