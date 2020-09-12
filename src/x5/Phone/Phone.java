package x5.Phone;

public class Phone {
    long number = 9996478812L;
    String model = "Samsung", name = "Alex";
    double weight = 0.254;

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }


    public Phone() {

    }

    public Phone(long number, String model, double weight) {
        this(64465466, "Apple");
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public void receiveCall() {
        System.out.println("Звонит " + name);
    }

    public void getNumber() {
        System.out.println(number);
    }
}
