package x5.Phone;


public class Main {


    public static void main(String[] args) {
        Phone copy0 = new Phone();
        Phone copy1 = new Phone();
        Phone copy2 = new Phone();
        System.out.println("Номер телефона: " +copy0.numberOfCall);
        System.out.println( "Модель телефона: " + copy1.model);
        System.out.println("Вес телефона: " + copy2.weight);
        copy0.receiveCall();
        copy0.getNumber();
        Phone methodPhone = new Phone();
        methodPhone.receiveCall(999546456L, "Erzhan");
        methodPhone.sendMessage(8498494984L, 65465465L, 1561656565L);
    }
}
