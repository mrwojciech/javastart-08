package Zadanie03;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.Z;

public class TestSpeed {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Speed[] speeds = Speed.values();
        System.out.println("Dostepne predkosci to:");
        for (Speed speed :
                speeds) {
            System.out.print(speed.name()+" ");
        }

        System.out.println();

        System.out.println("Wybierz predkosc: ");
        String speed = scanner.nextLine();


        if (speed.matches("[0-9]+")){

            int speedInt = Integer.parseInt(speed);
            System.out.println("Poruszaszz sie z predkoscia: "+speedInt);
            System.out.println("Czyli: "+Speed.convertToEnum(speedInt));

    } else if (speed.matches("[A-Z]+")){

            System.out.println("Poruszasz sie z predkoscia:"+speed+" , ktora wynosi: "+ Speed.valueOf(speed).getSpeed());
        }



    }
}
