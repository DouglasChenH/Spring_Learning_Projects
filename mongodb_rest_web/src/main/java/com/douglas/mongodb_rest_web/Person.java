package com.douglas.mongodb_rest_web;

import org.springframework.data.annotation.Id;

//The Person has a first name and a last name.
//id object is configured to be automatically generated so you don’t have to deal with that.
public class Person {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}