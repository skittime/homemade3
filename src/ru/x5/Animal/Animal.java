package ru.x5.Animal;

public class Animal {
    String food, location, name, act;


    public void makeNoise() {

        System.out.println(name + " " + act);
    }

    public void eat() {

        System.out.println(name + " ест " + food + " " + location);
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }


    }




