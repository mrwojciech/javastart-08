package ZadanieD03;

public class Circle {
    double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "promień koła: " + radius;
    }
}
