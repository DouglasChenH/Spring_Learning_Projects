package com.douglas.assessing_mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
/*
In a typical Java application, you write a class that implements CustomerRepository and craft the queries yourself.
What makes Spring Data MongoDB so useful is the fact that you don’t have to create this implementation.
Spring Data MongoDB creates it on the fly when you run the application.
 */

public interface CustomerRepository extends MongoRepository<Customer, String> {

    //define other queries as needed by simply declaring their method signature.
    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}