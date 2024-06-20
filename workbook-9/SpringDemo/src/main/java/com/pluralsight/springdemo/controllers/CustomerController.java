package com.pluralsight.springdemo.controllers;

import com.pluralsight.springdemo.dao.CustomerDao;
import com.pluralsight.springdemo.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
   // List<Customer> customers = new ArrayList<>();

    private CustomerDao dao;

    @Autowired
    public CustomerController(CustomerDao dao){
        this.dao=dao;
    }
    //respond to http:localhost:8080/customers
    @RequestMapping(path="/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){
      /*  customers.add(new Customer(1, "Ezra Williams","123 ABC Lane"));
        customers.add(new Customer(2, "Onriel Houston","34 Cookie drive"));
        customers.add(new Customer(3, "Liam Bihn-King", "1 Matches Street"));*/
        List<Customer> customers = dao.getAll();
        return customers;
    }

   /* @RequestMapping(path="/customers", method=RequestMethod.GET)
    public List<Customer> getCustomers(@RequestParam(required = false) String name){
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setName(name);
        customers.add(customer);
        return customers;
    }*/

    @RequestMapping(path="/customers/{id}",method=RequestMethod.GET)
    public Customer getCustomer(@PathVariable String id) {
       /* for (Customer customer: customers){
            if (customer.getId()==id){
                return customer;
            }
        }
        return null;*/
        Customer customer = dao.findByCustomerId(id);
        return  customer;
    }

}
