package Day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDuration2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-mm-dd): ");
        String input1 = sc.nextLine();
        System.out.print("Enter second date (yyyy-mm-dd): ");
        String input2 = sc.nextLine();
        LocalDate d1 = LocalDate.parse(input1);
        LocalDate d2 = LocalDate.parse(input2);
        Period diff = Period.between(d1, d2);
        System.out.println("Duration:");
        System.out.println(Math.abs(diff.getYears()) + " Years");
        System.out.println(Math.abs(diff.getMonths()) + " Months");
        System.out.println(Math.abs(diff.getDays()) + " Days");
        sc.close();
    }
}
