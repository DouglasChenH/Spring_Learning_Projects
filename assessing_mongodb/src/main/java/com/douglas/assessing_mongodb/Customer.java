package com.douglas.assessing_mongodb;

import org.springframework.data.annotation.Id;

public class Customer {

    //id fits the standard name for a MongoDB id
    // so it doesn’t require any special annotation to tag it for Spring Data MongoDB.
    @Id
    public String id;

    //The other two properties, firstName and lastName, are left unannotated.
    // It is assumed that they’ll be mapped to fields that share the same name as the properties themselves.
    public String firstName;
    public String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    //The convenient toString() method will print out the details about a customer.
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}