package com.pluralsight.service;

import com.pluralsight.dao.RegistrationDAO;
import com.pluralsight.model.Product;
import com.pluralsight.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RegistrationService {
    private final RegistrationDAO registrationDAO;

    @Autowired
  //  @Qualifier("drink")
    private Product drink;

    // Autowired tells Spring to automatically inject a
    // object into this constructor when a RegistrationService
    // is created, more on this later
    // When there’s only one constructor with args, @autowired // is optional
    @Autowired
    public RegistrationService(RegistrationDAO registrationDAO){
        this.registrationDAO=registrationDAO;
    }

    public Long registerStudent(Student student) throws StudentAlreadyRegisteredException {
        if (this.registrationDAO.findById(student.getId()) != null){
            throw new StudentAlreadyRegisteredException();
        }
        return registrationDAO.persistStudent(student);
    }

}
