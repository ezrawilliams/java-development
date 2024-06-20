package com.pluralsight.springdemo.controllers;

import com.pluralsight.springdemo.dao.CustomerDao;
import com.pluralsight.springdemo.dao.EmployeeDao;
import com.pluralsight.springdemo.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    private EmployeeDao dao;

    @Autowired
    public EmployeeController(EmployeeDao dao){
        this.dao=dao;
    }

    //HANDLER METHODS:
    @RequestMapping(path="/employees",method= RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Employee addEmployee (@RequestBody Employee employee ) {
        // the insert method of the DAO should return
        // a Employee object with the new id that was generated
        Employee newEmployee = dao.insert(employee);
        // return the new supplier object
        return newEmployee;
    }

    @RequestMapping(path="/employees/{id}",method=RequestMethod.PUT)
    public void updateEmployee ( @PathVariable int id, @RequestBody Employee employee ) {
        // the update method of the DAO should accept the id
        // and the new employee information to update
        dao.update(id, employee);
    }

    @RequestMapping(path="/employees/{id}",method=RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteEmployee (@PathVariable int id) {
        // the delete method of the DAO
        // should accept the id of the employee
        dao.delete(id);
    }
}
