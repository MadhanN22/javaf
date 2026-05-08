package Day5;

import java.time.LocalDate;
import java.util.Scanner;

public class WarrantyExpiry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();
        LocalDate purchaseDate = LocalDate.parse(inputDate);

        System.out.print("Enter warranty years: ");
        int years = sc.nextInt();
        System.out.print("Enter warranty months: ");
        int months = sc.nextInt();

        LocalDate expiryDate = purchaseDate.plusYears(years).plusMonths(months);
        System.out.println("Warranty expires on: " + expiryDate);

        sc.close();
    }
}
