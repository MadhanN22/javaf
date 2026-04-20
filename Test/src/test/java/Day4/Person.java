package Day4;

import java.util.Scanner;

class Person {
    private String name;
    private float age;

    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public float getAge() { return age; }
}

class Account {
    private static long accCounter = 1000;
    private long accNum;
    private double balance;
    private Person accHolder;

    public Account(Person accHolder, double balance) {
        this.accNum = ++accCounter;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount >= 500) balance -= amount;
        else System.out.println("Withdrawal denied. Minimum balance of 500 required.");
    }

    public double getBalance() { return balance; }

    public String toString() {
        return "Account Number: " + accNum +
               "\nHolder: " + accHolder.getName() +
               "\nBalance: " + balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person smith = new Person("Smith", 30);
        Account smithAcc = new Account(smith, 2000);

        Person kathy = new Person("Kathy", 28);
        Account kathyAcc = new Account(kathy, 3000);

        smithAcc.deposit(2000);
        kathyAcc.withdraw(2000);

        System.out.println("Updated Accounts:");
        System.out.println(smithAcc);
        System.out.println(kathyAcc);

        sc.close();
    }
}
