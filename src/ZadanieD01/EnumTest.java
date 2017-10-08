package ZadanieD01;

import java.util.Scanner;

public class EnumTest {


    public static void main(String[] args) {

//        Direction direction = Direction.EAST;
        Direction[] directions = Direction.values();

        for (Direction direction :
                directions) {
            System.out.println(Direction.valueOf(direction.name()));
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kierunek:");
        String directionA = scanner.nextLine();
        String directionName;
        try {

            directionName = Direction.valueOf(directionA).getDirectionName();
        } catch (IllegalArgumentException e) {
            directionName = "UNNDEFINIED";
        }
        System.out.println("OK. Podales: " + directionName);

        System.out.println("Podaj liczba 0-3");
        System.out.println(Direction.convert(scanner.nextInt()));
    }


}
