package Day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PersonDetails {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public PersonDetails(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public int calculateAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void displayDetails() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Age: " + calculateAge());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String fn = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String ln = sc.nextLine();
        System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
        LocalDate dob = LocalDate.parse(sc.nextLine());
        PersonDetails p = new PersonDetails(fn, ln, dob);
        p.displayDetails();
        sc.close();
    }
}
