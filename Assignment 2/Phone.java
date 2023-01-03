package Assignment2;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

abstract public class Phone {
    List<Contact> contacts = new LinkedList<>();
    List<String> calls = new LinkedList<>();
    List<Message> messages = new LinkedList<Message>();
    int batteryLife;
    Color color;
    String material;
    String imei;

    public Phone(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public Phone(int batteryLife, Color color, String material, String imei) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    void addContact(String no, String phoneNumber, String firstName, String lastName) {
        contacts.add(Integer.parseInt(no) - 1, new Contact(phoneNumber, firstName, lastName));
    }

    void listContacts() {
        System.out.println("Contacts:");

        for(Contact contact : contacts)
            System.out.println(contact);

        System.out.println();
    }

    void sendMessage(String phoneNumber, String message) {
        messages.add(new Message(phoneNumber, message));
        batteryLife--;
    }

    void listMessages(String phoneNumber) {
        System.out.println("Messages: (" + phoneNumber + ")");

        for(Message message : messages)
            System.out.println(message);

        System.out.println();
    }

    void call(String phoneNumber) {
        calls.add(phoneNumber);
        batteryLife -=2;
    }

    void viewHistory() {
        System.out.println("History:");

        for(String phoneNumber : calls)
            System.out.println(phoneNumber);

        System.out.println();
    }
}
