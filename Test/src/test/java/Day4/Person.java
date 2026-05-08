package Day4;

class Account {
    static long counter = 1000;
    long accNum;
    double balance;
    Person accHolder;
    Account(double balance, Person accHolder) {
        this.accNum = ++counter;
        this.balance = balance;
        this.accHolder = accHolder;
    }
    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { if (balance - amt >= 500) balance -= amt; }
    public String toString() { return accNum + " " + balance; }
}

public class Person {
    String name;
    float age;
    Account account;
    Person(String name, float age, double balance) {
        this.name = name;
        this.age = age;
        this.account = new Account(balance, this);
    }
    public String toString() { return name + " " + age + " " + account; }

    public static void main(String[] args) {
        Person smith = new Person("Smith", 30, 2000);
        Person kathy = new Person("Kathy", 25, 3000);
        smith.account.deposit(2000);
        kathy.account.withdraw(2000);
        System.out.println(smith);
        System.out.println(kathy);
    }
}
