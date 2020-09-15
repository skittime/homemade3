package partTwo.Animal;

public class Veterinarian extends Animal {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getName() + " " + "ест" + " " + animal.getFood() + " " + animal.getLocation());

    }

}