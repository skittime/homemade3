package ru.x5.Phone;

public class Main {
    public static void main(String[] args) {
        Phone copy0 = new Phone(65465465, "Apple", 4654.165);
        Phone copy1 = new Phone(547475745746L,"Xiaomi", 156.15);
        Phone copy2 = new Phone(53469847367394L, "Asus", 0.345);
        System.out.println("Номер телефона: " + copy0.numberOfCall);
        System.out.println("Модель телефона: " + copy1.model);
        System.out.println("Вес телефона: " + copy2.weight);
        copy0.receiveCall();
        copy0.getNumber();
        Phone methodPhone = new Phone(4563495309L,"Asus", 0.36);
        methodPhone.receiveCall(999546456L, "Erzhan");
        methodPhone.sendMessage(8498494984L, 65465465L, 1561656565L);
    }
}
