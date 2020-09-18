package ru.x5.Students;

public class Student {

    String firstName, lastName , group;
    double averageMark = 4;
    double scholarship;
    public static void main(String[] args) {
     Student student = new Aspirant();
     Student student3 = new Student();
    Student[] students1 = new Student[]{student,student3};
        Student students2;
        students2 = students1[0];
        student.getScholarship(students2);

        students2 = students1[1];
        student.getScholarship(students2);

    }
    public void getScholarship(Student students2){
        if (averageMark == 5){
            scholarship = 100;
        }else {
            scholarship = 80;
        }
        System.out.println(scholarship + " " + getFirstName());
    }

    public String getFirstName() {
        return firstName;
    }
}
