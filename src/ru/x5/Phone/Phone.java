
package ru.x5.Phone;


public class Phone {
    long numberOfCall;
    String model, name;
    double weight;

    public Phone(long numberOfCall, String model, double weight) {
        this.numberOfCall = numberOfCall;
        this.model = model;
        this.weight = weight;
    }


    public void receiveCall() {
        this.numberOfCall += numberOfCall;
        this.name += name;
        System.out.println("Звонит " + numberOfCall + " " + name);
    }

    public void receiveCall(long numberOfCall, String name) {
        this.numberOfCall += numberOfCall;
        this.name += name;
        System.out.println("Звонит " + numberOfCall + " " + name);
    }

    public void getNumber() {

        System.out.println(numberOfCall);
    }

    public void sendMessage(long numberOfCall0, long numberOfCall1, long numberOfCall2) {
        System.out.println("Номера для сообщений " + numberOfCall0 + " " + numberOfCall1 + " " + numberOfCall2);
    }
}
