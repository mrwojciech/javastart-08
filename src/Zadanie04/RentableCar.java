package Zadanie04;

public class RentableCar extends Car implements Rentable {

    boolean isRented = false;

    @Override
    public Person rent(String firstName, String lastName, String id) {
        person.firstName = firstName;
        person.lastName = lastName;
        person.id = id;
        isRented = true;
        return person;
    }

    @Override
    public void handOver() {
        person.firstName = null;
        person.lastName = null;
        person.id = null;
        isRented = false;
    }

    @Override
    public boolean isRent() {
        return isRented;
    }
}
