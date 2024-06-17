package com.pluralsight;

import com.pluralsight.model.Student;
import com.pluralsight.service.RegistrationService;
import com.pluralsight.service.StudentAlreadyRegisteredException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws StudentAlreadyRegisteredException {
        // Open beans.xml where in this file there is a directive
        // called component-scan Spring scans the files in the
        // package declared looking for annotations like
        // @Component and @Autowired. Spring will then do the
        // wiring for you.

        ApplicationContext ctx = new ClassPathXmlApplicationContext("/beans.xml");
        // Pluck out the Registration Service from Spring. Think
        // of your application like black box and you are asking
        // for a component of a certain type.
        // RegistrationService will already have the
        // DataAccessObject injected into it by the time
        // you receive this reference
        RegistrationService registrationService = ctx.getBean(RegistrationService.class);
        Long studentID = registrationService.registerStudent(
                new Student("Alan", "Turing", "Computer Science"));
        System.out.println("Student Registered with ID: " + studentID);
        Long studentID2 = registrationService.registerStudent(
                new Student("Johannes", "Kepler", "Astronomy"));
        System.out.println("Student Registered with ID: " +studentID2);
    }
}
