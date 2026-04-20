package Day1;
import java.util.Scanner;2
public class postivenegnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

	        if (num > 0) {
	            System.out.println("Positive number");
	        } else if (num < 0) {
	            System.out.println("Negative number");
	        } else {
	            System.out.println("Zero");
	        }
        }
	}


