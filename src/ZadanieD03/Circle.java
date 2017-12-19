package ZadanieD03;

public class Circle extends GeometricShape{
    double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "promień koła: " + radius;
    }
}
