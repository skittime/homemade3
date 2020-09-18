package ru.x5.Students;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averageMark) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    @Override
    public void getScholarship() {
        if (averageMark >= 5) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        System.out.println(scholarship + " " + firstName + " " + lastName + " " + group);
    }


}