package Zadanie04;


public interface Rentable {

    Person person = null;

    Person rent(String firstName, String lastName, String Id);

    void handOver();

    boolean isRent();


}
