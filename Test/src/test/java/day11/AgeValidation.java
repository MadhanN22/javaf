package day11;

import java.util.Scanner;

class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            validateAge(age);
            System.out.println("Valid age: " + age);
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateAge(int age) throws AgeInvalidException {
        if (age <= 15) {
            throw new AgeInvalidException("Age must be above 15");
        }
    }
}

