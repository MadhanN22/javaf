package Day7;

class Account {
    static long counter = 1000;
    long accNum;
    double balance;
    Account(double balance) {
        accNum = ++counter;
        this.balance = balance;
    }
    void deposit(double amt) { balance += amt; }
    boolean withdraw(double amt) { return false; }
    public String toString() { return accNum + " " + balance; }
}

class SavingsAccount extends Account {
    final double minimumBalance = 500;
    SavingsAccount(double balance) { super(balance); }
    boolean withdraw(double amt) {
        if (balance - amt >= minimumBalance) { balance -= amt; return true; }
        return false;
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;
    CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }
    boolean withdraw(double amt) {
        if (balance - amt >= -overdraftLimit) { balance -= amt; return true; }
        return false;
    }
}

public class Accounts {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(2000);
        CurrentAccount ca = new CurrentAccount(3000, 1000);
        sa.withdraw(1800);
        ca.withdraw(3500);
        System.out.println(sa);
        System.out.println(ca);
    }
}
