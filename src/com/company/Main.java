package com.company;



public class Main {



    public static void main(String[] args) {
        Phone copy0 = new Phone();
        Phone copy1 = new Phone();
        Phone copy2 = new Phone();
        System.out.println(copy0.number);
        System.out.println(copy1.model);
        System.out.println(copy2.weight);
        copy0.receiveCall();
        copy0.getNumber();
        ;


    }
}
