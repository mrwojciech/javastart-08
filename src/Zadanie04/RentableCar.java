package Zadanie04;

public class RentableCar extends Car implements Rentable {

    public RentableCar(String name, int prodYesr, String direction, int seatsNumber, boolean isRented, Person customer) {
        super(name, prodYesr, direction, seatsNumber);
        this.isRented = isRented;
        this.customer = customer;
    }

    boolean isRented = false;
    Person customer;

    @Override
    public void handOver() {
        isRented = false;
    }

    @Override
    public Person getCustomer() {
        return customer;
    }

    @Override
    public boolean isRent() {
        return isRented;
    }

    @Override
    public void rent(Person person) {
        customer = person;
        isRented = true;

    }

    @Override
    public String toString() {
        return super.toString() + " Czy jest wypozyczony:" + isRented + (isRented == true ? customer : "");
    }
}
