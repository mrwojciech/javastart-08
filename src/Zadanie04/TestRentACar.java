package Zadanie04;

public class TestRentACar {

    public static void main(String[] args) {

        Car car = new Car();
        RentableCar rentableCar = new RentableCar();
        Person person = new Person("Jan", "Jakubowicz", 22, "321");
        Person person1 = new Person();
        person1 = rentableCar.rent("Jakub","Manowski","2345");

        rentableCar.isRent();
        rentableCar.handOver();
        rentableCar.isRent();
    }


}
