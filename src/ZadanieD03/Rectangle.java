package ZadanieD03;

public class Rectangle extends  GeometricShape{

    double sideA, sideB;


    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public String toString() {
        return "Boki prostokąta: "+sideA +", "+sideB+". ";


    }
}
