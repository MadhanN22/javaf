package Day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDuration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = sc.nextLine();
        LocalDate givenDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();
        Period diff = Period.between(givenDate, currentDate);
        System.out.println("Duration:");
        System.out.println(diff.getYears() + " Years");
        System.out.println(diff.getMonths() + " Months");
        System.out.println(diff.getDays() + " Days");
        sc.close();
    }
}
