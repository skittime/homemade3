package ru.x5.Students;

public class Aspirant extends Student {

    @Override
    public void getScholarship(Student students2) {

        averageMark = 6;
        if (averageMark >= 5){
            scholarship = 200;}
        else {
            scholarship = 180;
        }
        System.out.println(scholarship + " " + getFirstName());
    }

    public String getFirstName() {
        return firstName;
    }
}
