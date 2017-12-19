package Zadanie01;

public class TestPerson {


    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Jan","Nowak","123456789",32);
        persons[1] = new Person("Jan","Nowak","123456789",32);
        persons[2] = new Person("Jan","Nowak","123456789",33);

        for (Person person :
                persons) {
            System.out.println(person);
        }

        if (persons[0].equals(persons[1])) {
            System.out.println("Person 0 jest rowny person 1");
        }

        if (persons[0].equals(persons[2])) {
            System.out.println("Person 0 jest rowny person 2");
        }

        if (persons[1].equals(persons[2])) {
            System.out.println("Person 1 jest rowny person 2");
        }

    }
}
