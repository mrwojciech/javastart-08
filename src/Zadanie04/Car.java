package Zadanie04;

public class Car extends Vehicle{

    int seatsNumber;


    @Override
    public String turnLeft() {
        return "LEFT";
    }

    @Override
    public String turnRight() {
        return "RIGHT";
    }

    @Override
    public String goForward() {
        return "FORWARD";
    }

    @Override
    public String goBack() {
        return "BACK";
    }
}
