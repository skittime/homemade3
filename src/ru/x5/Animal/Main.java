package ru.x5.Animal;

public class Main {
    public static void main(String[] args) {
            Animal animal;
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
        Animal[] animals = new Animal[]{dog,cat,horse};
            for (Animal value:animals) {
            animal = value;
            veterinarian.treatAnimal(animal);

        }
    }
}
