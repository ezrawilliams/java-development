package com.pluralsight.dao;

import com.pluralsight.model.Student;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/* Component tells Spring to create an object from the class and
identify it as RegistrationDAO type. If any other component
requires a RegistrationDAO type it will use this object created
 by Spring. The default scope for the object is singleton.
 Which means that it will be available for the duration of the
 application
 */
@Component // This class is marked as a Spring bean and Spring will manage it
public class SimpleRegistrationDAO implements RegistrationDAO{

    private HashMap<Long, Student> hashMap;
    private Long counter = 60L;

    public SimpleRegistrationDAO(){
        hashMap= new HashMap<>();
        hashMap.put(10L, new Student(10L, "Marie", "Curie", "Science"));
        hashMap.put(22L, new Student(22L, "Albert", "Einstein", "Science"));
        hashMap.put(44L, new Student(44L, "Niels", "Bohr", "Science"));
        hashMap.put(54L, new Student(54L, "Carl", "Jung", "Psychology"));
    }

    @Override
    public Long persistStudent(Student student) {
        long freshId = counter++;
        this.hashMap.put(freshId, new Student(freshId, student.getFirstName(),
                student.getLastName(), student.getMajor()));
        return freshId;
    }

    @Override
    public Student findById(Long id) {
        return hashMap.get(id);
    }
}
