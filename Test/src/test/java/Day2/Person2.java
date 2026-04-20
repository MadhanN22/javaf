package Day2;

import java.util.Scanner;

public class Person2 {
    enum Gender { M, F }

    private String firstName;
    private String lastName;
    private Gender gender;
    private String phoneNumber;

    public Person2(String firstName, String lastName, Gender gender, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System