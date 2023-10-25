import java.util.Scanner;

public class Person1 {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    // Constructor
    public Person1(String firstName, String middleName, String lastName, int age, String birthday, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Person object and setting attributes using setters
        Person person = new Person("John", "Doe", "Smith", 30, "1993-05-15", "123 Main St");

        // Getting and displaying attributes using getters
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Middle Name: " + person.getMiddleName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birthday: " + person.getBirthday());
        System.out.println("Address: " + person.getAddress());

        // Modifying attributes using setters
        person.setAge(31);
        person.setAddress("456 Elm St");

        // Getting and displaying modified attributes using getters
        System.out.println("Modified Age: " + person.getAge());
        System.out.println("Modified Address: " + person.getAddress());
    }
}