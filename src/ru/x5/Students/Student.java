package ru.x5.Students;

public class Student {

    String firstName, lastName , group;
    double averageMark;
    double scholarship;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public void getScholarship () {
            if (averageMark == 5) {
                scholarship = 100;
            } else {
                scholarship = 80;
            }
            System.out.println(scholarship + " " + firstName + " " + lastName + " " + group);
        }
    }






