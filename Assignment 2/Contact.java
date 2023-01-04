package Assignment2;

public class Contact {
    String phoneNumber;
    String firstName;
    String lastName;

    public Contact(String phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
