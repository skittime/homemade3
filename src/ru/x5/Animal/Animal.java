package ru.x5.Animal;

public class Animal {
    String food, location, name, act;
    Animal animal;

    public void main() {
        Dog dog = new Dog(
                "тапки",
                "в будке",
                "Шарик",
                "воет на луну");
        Cat cat = new Cat(
                "мышей",
                "из миски",
                "Пушок",
                "шуршит");
        Horse horse = new Horse(
                "овёс",
                "в стойле",
                "Нюша",
                "ржёт");
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



