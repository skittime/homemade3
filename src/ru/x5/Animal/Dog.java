package ru.x5.Animal;

public class Dog extends Animal {
    private final String food;
    private final String location;
    private final String name;
    private final String act;

    public Dog(String food, String location, String name, String act) {
        this.food = food;
        this.location = location;
        this.name = name;
        this.act = act;
    }

    public String getName() {

        return name;
    }


    public String getLocation() {

        return location;
    }

    public String getFood() {

        return food;
    }

    @Override
    public void eat() {

        System.out.println(name + " грызет " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " " + act + " " + location);

    }

}

