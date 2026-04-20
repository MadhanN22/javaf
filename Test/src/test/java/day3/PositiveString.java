package day3;

import java.util.Scanner;

public class PositiveString {
    public static boolean isPositive(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) <= str.charAt(i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toUpperCase();
        if (isPositive(input))
            System.out.println("Positive String");
        else
            System.out.println("Not a Positive String");
        sc.close();
    }
}
