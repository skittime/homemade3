package ru.x5.Animal;

public class Cat extends Animal {
    String name = "PushOK", act = "мяукает", location = "из миски", food = "мышей";

    public void eat() {

        System.out.println(name + " ест " + food + " " + location);
    }

    @Override
    public String getName() {
        return name;
    }



    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getFood() {
        return food;
    }

    public void makeNoise() {

        System.out.println(name + " " + act + " " + location);
    }
}
