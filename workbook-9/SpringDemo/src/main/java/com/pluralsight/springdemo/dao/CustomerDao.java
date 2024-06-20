package com.pluralsight.springdemo.dao;

import com.pluralsight.springdemo.models.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getAll();
    public Customer findByCustomerId(String id);
}
