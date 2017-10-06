package Zadanie04;

public class MotorBike extends Vehicle{

int speedLimit;

    public MotorBike(String name, int prodYesr, String direction, int speedLimit) {
        super(name, prodYesr, direction);
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return super.toString()+" limit predkosci"+speedLimit;
    }
}
