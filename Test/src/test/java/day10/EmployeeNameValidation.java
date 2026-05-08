package day10;

import java.util.Scanner;

class NameBlankException extends Exception {
    public NameBlankException(String message) {
        super(message);
    }
}

public class EmployeeNameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        try {
            validateName(firstName, lastName);
            System.out.println("Valid full name: " + firstName + " " + lastName);
        } catch (NameBlankException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateName(String firstName, String lastName) throws NameBlankException {
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new NameBlankException("First name or last name cannot be blank");
        }
    }
}
