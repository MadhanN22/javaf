package day14;


import java.util.*;

public class ProductArrayListSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            products.add(sc.nextLine());
        }
        Collections.sort(products);
        for (String p : products) {
            System.out.println(p);
        }
    }
}

