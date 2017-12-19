package ZadanieD03;

public class Ball extends Shape3D{

    double radius;


    public Ball(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return " promień: "+radius;
    }
}
