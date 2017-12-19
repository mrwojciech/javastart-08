package Zadanie01;

public class Person {
    String firstName;
    String lastName;
    String pesel;
    int age;

    public Person(String firstName, String lastName, String pesel, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }


    @Override
    public String toString() {
        return ("Imie: " + firstName + " Nazwisko: " + lastName + " pesel: " + pesel + " wiek:" + age);
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;

        Person other = (Person) obj;

        if (firstName == null) {
            if (other.firstName != null) return false;

        } else if (!firstName.equals(other.firstName)) return false;

        if (lastName == null) {
            if (other.lastName != null) return false;

        } else if (!lastName.equals(other.lastName)) return false;

        if (pesel == null) {
            if (other.pesel != null) return false;

        } else if (!pesel.equals(other.pesel)) return false;

        if (age != other.age) return false;

        return true;
    }
}
