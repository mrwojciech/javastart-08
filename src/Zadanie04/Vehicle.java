package Zadanie04;

public abstract class Vehicle implements Movable {

    String name;
    int prodYesr;
    String direction;

    public Vehicle(String name, int prodYesr, String direction) {
        this.name = name;
        this.prodYesr = prodYesr;
        this.direction = direction;
    }

    @Override
    public void turnLeft() {
        direction = "Left";
    }

    @Override
    public void turnRight() {
        direction = "Right";
    }

    @Override
    public void goForward() {
        direction = "Forward";
    }

    @Override
    public void goBack() {
        direction = "Back";
    }

    @Override
    public String getDirection() {
        return direction;
    }


    public String toString() {
        return "Nazwa:"+name+" Rok produkcji: "+"kierunek:"+direction;
    }
}
