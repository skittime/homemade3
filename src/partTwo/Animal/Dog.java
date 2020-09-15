package partTwo.Animal;

public class Dog extends Animal {
    String name = "Шарик", act = "воет на луну", location = "в будке", food = "тапки";

    public String getName() {
        return name;
    }

    public String getAct() {
        return act;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFood(String food) {
        this.food = food;
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
public void getFood (String food) {
        this.food = food;
}
    //@Override
    //public void treatAnimal(String animal) {
    //    System.out.println(name + food + location);
    }


