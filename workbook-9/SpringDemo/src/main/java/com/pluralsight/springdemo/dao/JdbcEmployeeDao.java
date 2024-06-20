package com.pluralsight.springdemo.dao;

import com.pluralsight.springdemo.models.Employee;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class JdbcEmployeeDao  implements EmployeeDao{
    private BasicDataSource dataSource;

    @Autowired
    public JdbcEmployeeDao(BasicDataSource dataSource){
        this.dataSource=dataSource;
    }
    @Override
    public Employee insert(Employee employee) {
       // int id = employee.getEmployeeId();
        String fname = employee.getFirstName();
        String lname = employee.getLastName();
        String hireDate = employee.getHireDate();
        String query = "INSERT INTO employees (FirstName, LastName, HireDate, Notes) VALUES (?, ?, " +
                "?,?);";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);){
            //statement.setInt(1, id);
            statement.setString(1, fname);
            statement.setString(2, lname);
            statement.setString(3, hireDate);
            statement.setString(4, "No notes");
            int rows = statement.executeUpdate();
            System.out.println("Rows updated "+rows);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public void update(int id, Employee employee) {
        String query = "UPDATE employees SET firstName = ?, lastName = ?, HireDate=? " +
                "WHERE EmployeeID = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);){
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.setString(3, employee.getHireDate());
            statement.setInt(4, id);
            int rows = statement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM employees WHERE EmployeeID = ?;";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);){
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            System.out.println("Rows deleted "+rows);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
