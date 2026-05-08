package Day2;

import java.util.Scanner;

enum Gender { M, F }

public class Person2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine().toUpperCase();
        if (g.equals("M") || g.equals("F")) {
            Gender gender = Gender.valueOf(g);
            System.out.println(gender);
        } else {
            System.out.println("Invalid");
        }
    }
}
