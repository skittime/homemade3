package partTwo.Animal;

public class Cat {
    String name = "Cat";

    public void eat() {
        this.name += name;
        System.out.println(name + " ест мышей");
    }

    public void makeNoise() {
        this.name += name;
        System.out.println(name + " шуршит пакетом");
    }
}