package Day8;

import java.util.concurrent.atomic.AtomicLong;

class Person {
    private String name;
    private float age;

    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public float getAge() { return age; }
    public void setAge(float age) { this.age = age; }

    public String toString() {
        return name + " (" + age + ")";
    }
}

abstract class Account {
    private static final AtomicLong counter = new AtomicLong(1000);
    private long accNum;
    private double balance;
    private Person accHolder;

    public Account(Person accHolder, double balance) {
        this.accNum = counter.incrementAndGet();
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public long getAccNum() { return accNum; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public Person getAccHolder() { return accHolder; }
    public void setAccHolder(Person accHolder) { this.accHolder = accHolder; }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);

    public String toString() {
        return "Account " + accNum + " | Holder: " + accHolder + " | Balance: " + balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= 500) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance. Minimum 500 required.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person smith = new Person("Smith", 30);
        Person kathy = new Person("Kathy", 28);

        SavingsAccount acc1 = new SavingsAccount(smith, 2000);
        SavingsAccount acc2 = new SavingsAccount(kathy, 3000);

        acc1.deposit(2000);
        acc2.withdraw(2000);

        System.out.println(acc1);
        System.out.println(acc2);
    }
}
