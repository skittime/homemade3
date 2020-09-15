package ru.x5.Animal;

public class Animal {

    String food, location, name, act;

    public static void main(String[] args) {
        Animal animal;
        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[]{dog, cat, horse};
        for (Animal value : animals) {
            animal = value;
            veterinarian.treatAnimal(animal);
        }
    }

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



