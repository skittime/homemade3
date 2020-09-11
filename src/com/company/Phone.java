package com.company;

public class Phone {
    long number = 9996478812l;
    String model = "Samsung", name = "Alex";

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    double weight = 0.254;

    public Phone() {
    }

    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public void receiveCall(){
        System.out.println("Звонит " + name);
    }
    public void getNumber (){
        System.out.println(number);
    }
}
