public class Person {
    private String firstName;
    private String lastName;
    private Address home;

    public Person(String lastName, String firstName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
