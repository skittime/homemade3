package ru.x5.Students;

public class Main {
    public static void main(String[] args) {
        Student student = new Aspirant("Алексндр", "Пупкин", "ФГСТЮС30", 4);
        Student student3 = new Student("Семен", "Петелькин", "90G", 5);
        Student[] students1 = new Student[]{student, student3};
        for (Student p : students1) {
            p.getScholarship();
        }

    }

}

