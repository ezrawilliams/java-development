package com.pluralsight.model;

import java.util.Objects;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String major;

    public Student(Long id, String firstName, String lastName, String major) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    public Student(String firstName, String lastName, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(major, student.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, major);
    }
}
