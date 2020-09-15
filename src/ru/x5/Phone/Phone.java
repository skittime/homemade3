
package ru.x5.Phone;


public class Phone {


    public static void main(String[] args) {
        Phone copy0 = new Phone();
        Phone copy1 = new Phone();
        Phone copy2 = new Phone();
        System.out.println("Номер телефона: " + copy0.numberOfCall);
        System.out.println("Модель телефона: " + copy1.model);
        System.out.println("Вес телефона: " + copy2.weight);
        copy0.receiveCall();
        copy0.getNumber();
        Phone methodPhone = new Phone();
        methodPhone.receiveCall(999546456L, "Erzhan");
        methodPhone.sendMessage(8498494984L, 65465465L, 1561656565L);
    }

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
