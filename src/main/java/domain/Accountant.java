package domain;

import java.util.List;

public class Accountant {

    private int id;
    private String email;
    private String firstName;
    private List<String> middleNames;
    private String surname;
    private int houseNumber;
    private String street;
    private String zipCode;
    private String city;

    //Constructor


    public Accountant(int id, String email, String firstName, List<String> middleNames, String surname, int houseNumber, String street, String zipCode, String city) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.middleNames = middleNames;
        this.surname = surname;
        this.houseNumber = houseNumber;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }
}
