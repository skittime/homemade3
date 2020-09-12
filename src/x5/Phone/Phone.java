package x5.Phone;

public class Phone {
    long numberOfCall = 9996478812L;
    String model = "Samsung", name = "Alex";
    double weight = 0.254;

    public Phone(long numberOfCall, String model) {
        this.numberOfCall = numberOfCall;
        this.model = model;
    }


    public Phone() {

    }

    public Phone(long numberOfCall, String model, double weight) {
        this(64465466, "Apple");
        this.numberOfCall = numberOfCall;
        this.model = model;
        this.weight = weight;
    }


    public void receiveCall() {
        this.numberOfCall += numberOfCall;
        this.name += name;
        System.out.println("Звонит " + numberOfCall + name);
    }

    public void receiveCall(long numberOfCall, String name) {
        this.numberOfCall += numberOfCall;
        this.name += name;
        System.out.println("Звонит " + numberOfCall+ " " + name);
    }
    public void getNumber() {
        System.out.println(numberOfCall);
    }
}
