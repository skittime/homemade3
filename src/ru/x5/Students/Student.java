package ru.x5.Students;

public class Student {

    String firstName = "Петелькин" , lastName , group;
    double averageMark = 4;
    double scholarship;
    public static void main(String[] args) {
     Student student = new Aspirant();
     Student student3 = new Student();
    Student[] students1 = new Student[]{student,student3};
        Student students2 = null;
        for (int i = 0; i < students1.length; i++) {
            students2=students1[i];
            student.getScholarship(students2);

        }
    }
    public void getScholarship(Student students2){
        if (averageMark == 5){
            scholarship = 100;
        }else {
            scholarship = 80;
        }
        System.out.println(scholarship + " " + firstName);
    }




}
