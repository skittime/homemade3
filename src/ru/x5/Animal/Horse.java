package ru.x5.Animal;

public class Horse extends Animal {
    String name = "Нюша", act = "ржёт", location = "в стойле", food = "овёс";

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
