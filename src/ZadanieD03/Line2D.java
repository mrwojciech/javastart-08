package ZadanieD03;

public class Line2D {

    double x1, x2;
    double y1, y2;

    public Line2D(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    @Override
    public String toString() {
        return "Współrzędne x: ("+x1+", "+y1+"), y: ("+y1+", "+y2+").";
    }
}
