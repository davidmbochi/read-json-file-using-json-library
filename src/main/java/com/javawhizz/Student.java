package com.javawhizz;

public class Student {
    private final Long studentId;

    private final String firstName;

    private final String lastName;

    private final String email;

    public Student(Long studentId,
                   String firstName,
                   String lastName,
                   String email){
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
