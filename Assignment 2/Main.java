package Assignment2;

public class Main {
    public static void main(String[] args) {
        Phone phone = new SamsungGalaxyS6();

        phone.addContact("1", "0725451698", "Diana", "Stefan");
        phone.addContact("2", "0733492813", "Marius", "Marin");
        phone.listContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendMessage("0725451698", "message content");
        phone.listMessages("0725451698");

        // send a message to the second contact from the previous listed
        phone.call("0733492813");
        phone.viewHistory();

    }

}
