package ru.x5.Animal;

public class Horse extends Animal {
        public Horse(String food, String location, String name, String act) {
            this.food = food;
            this.location = location;
            this.name = name;
            this.act = act;
        }

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
