package ZadanieD03;

import Zadanie04.Rentable;

public class LineCalc {


    double lineLenght(Line2D line2D) {
        double lenght = 0;

        double temp = (line2D.x2 - line2D.x1) * (line2D.x2 - line2D.x1) + (line2D.y2 - line2D.y1) * (line2D.y2 - line2D.y1);

        return Math.sqrt(temp);

    }


}