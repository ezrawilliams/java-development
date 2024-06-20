package com.pluralsight.springdemo.dao;

import com.pluralsight.springdemo.models.Employee;

public interface EmployeeDao {
    Employee insert(Employee employee);
    void update(int id, Employee employee);
    void delete(int id);
}
