package Zadanie02;

import java.util.Scanner;

public class TestString {

    public static void main(String[] args) {
String str = null,str2 = null;

        do {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            str2 = scanner.nextLine();


        }while (!str.equals(str2));



    }
}
