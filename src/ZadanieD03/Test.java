package ZadanieD03;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Test {


    public static void main(String[] args) {

        Line2D line2D = new Line2D(2, 3, 4, 5);

        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(6);

        Ball ball = new Ball(6);
        Cube cube = new Cube(15);

        LineCalc lineCalc = new LineCalc();

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Dlugosc odcinka: " + line2D + " wynosi: " + lineCalc.lineLenght(line2D));

        System.out.println("Pole prostokąta: " + rectangle + " Równa się: " + shapeCalculator.rectangleArea(rectangle));

        System.out.println("Pole kola: " + circle + " równa się: " + shapeCalculator.circleArea(circle));

        System.out.println("Objętość kuli: " + ball + " równa się: " + shapeCalculator.ballVolume(ball));

        System.out.println("Objetość sześcianu: " + cube + " równa się: " + shapeCalculator.cubeVolume(cube));
    }
}
