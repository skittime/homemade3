package com.company;

public class Phone {
    int number;
    String model, name;
    double weight;


    public void receiveCall(String name){
        System.out.println("Зваонит " + name);
    }
}
