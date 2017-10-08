package ZadanieD02;

import java.util.Scanner;

public class HumansList {

    public static void main(String[] args) {

        Human[] humans = new Human[2];
        Human humanTmp;
//                new Human();
        HumansList humansList = new HumansList();
        boolean isDuplicate;
        int index = 0;
        do {

            humanTmp = humansList.askForNewHumanData();
            isDuplicate = humansList.checkDuplicates(humans, humanTmp);
            if (!isDuplicate) {
                humans[index] = humanTmp;
                System.out.println("Dopisany do bazy.");
                index++;
            }
        } while (index != humans.length);
    }

    private boolean checkDuplicates(Human[] humans, Human humanTmp) {
        for (Human human : humans) {
            if (humanTmp.equals(human)) {
                System.out.println("Znalezniony duplikat");
                return true;
            }
        }
        return false;
    }

    public Human askForNewHumanData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        return new Human(name, age);
    }
}
