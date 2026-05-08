package day12;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] products = new String[n];
        for (int i = 0; i < n; i++) {
            products[i] = sc.nextLine();
        }
        Arrays.sort(products);
        for (String p : products) {
            System.out.println(p);
        }
    }
}
