package ZadanieD03;

public class Cube extends Shape3D{
    double side;


    public Cube(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "bok: " + side;
    }
}
