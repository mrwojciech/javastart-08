package ZadanieD03;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.radius, 2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.sideB * rectangle.sideA;
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4 / 3 * Math.PI * Math.pow(ball.radius, 3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.side, 3);
    }
}
