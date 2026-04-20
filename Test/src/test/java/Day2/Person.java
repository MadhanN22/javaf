package Day2;
import java.util.Scanner;
public class Person {

	 private String firstName;
	    private String lastName;
	    private char gender;
	    private String phoneNumber;

	    public Person(String firstName, String lastName, char gender, String phoneNumber) {
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
	        System.out.println("Phone Number: " + phoneNumber);
	    }
	
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String fn = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String ln = sc.nextLine();
        System.out.print("Enter Gender (M/F): ");
        char g = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String ph = sc.nextLine();
        Person p = new Person(fn, ln, g, ph);
        p.displayDetails();
        sc.close();
    }
}
