package Zadanie04;

public class TestRentAndACar {

    public static void main(String[] args) {

        Car car = new Car("Volvo",2000,"parking",3);
        RentableCar rentableCar = new RentableCar("Polonez",1999,"parking",1,false,null);
        Person person = new Person("Jan", "Jakubowicz", 22, "321-111");
        Person person1 = new Person();


        car.turnLeft();
        System.out.println(car.getDirection());
        car.turnRight();
        System.out.println(car.getDirection());
        car.goForward();
        System.out.println(car.getDirection());
        car.goBack();
        System.out.println(car.getDirection());


        System.out.println("Nowy samochod");
        rentableCar.isRent();
        System.out.println(rentableCar);
        System.out.println("Samochod wypozyczony:");
        rentableCar.rent(person);
        System.out.println(rentableCar);
        System.out.println("Samochod zwrocony");
        rentableCar.handOver();
        System.out.println(rentableCar);
    }


}
