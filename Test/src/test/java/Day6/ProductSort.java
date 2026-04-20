package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] products = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter product " + (i + 1) + ": ");
            products[i] = sc.nextLine();
        }
        Arrays.sort(products);
        System.out.println("Sorted Products:");
        for (String p : products) {
            System.out.println(p);
        }
        sc.close();
    }
}

