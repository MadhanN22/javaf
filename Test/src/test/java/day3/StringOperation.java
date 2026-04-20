package day3;

import java.util.Scanner;

public class StringOperation {
    public static String process(String str, int choice) {
        switch (choice) {
            case 1: return str + str;
            case 2: {
                StringBuilder sb = new StringBuilder(str);
                for (int i = 0; i < sb.length(); i += 2) sb.setCharAt(i, '#');
                return sb.toString();
            }
            case 3: {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (sb.indexOf(String.valueOf(c)) == -1) sb.append(c);
                }
                return sb.toString();
            }
            case 4: {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (i % 2 == 0) sb.append(Character.toUpperCase(c));
                    else sb.append(c);
                }
                return sb.toString();
            }
            default: return "Invalid choice";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Choose operation:");
        System.out.println("1. Add string to itself");
        System.out.println("2. Replace odd positions with #");
        System.out.println("3. Remove duplicate characters");
        System.out.println("4. Change odd characters to upper case");
        int choice = sc.nextInt();
        System.out.println("Result: " + process(input, choice));
        sc.close();
    }
}
