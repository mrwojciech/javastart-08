package Zadanie04;

public class Car extends Vehicle{

    int seatsNumber;

    public Car(String name, int prodYesr, String direction, int seatsNumber) {
        super(name, prodYesr, direction);
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString() {
        return super.toString()+" liczba siedzen: "+seatsNumber;
    }
}
