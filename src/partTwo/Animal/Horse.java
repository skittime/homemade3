package partTwo.Animal;

public class Horse {
    String name = "Horse";

    public void eat() {
        this.name += name;
        System.out.println(name + " ест траву");
    }

    public void makeNoise() {
        this.name = name;
        System.out.println(name + " создает шум");
    }
}