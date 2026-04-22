package Day7;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;
    String designation;
    String insuranceScheme;
    Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }
    public String toString() {
        return id + " " + name + " " + salary + " " + designation + " " + insuranceScheme;
    }
}

interface EmployeeService {
    void assignScheme(Employee e);
}

class EmployeeServiceImpl implements EmployeeService {
    public void assignScheme(Employee e) {
        if (e.salary > 5000 && e.salary < 20000 && e.designation.equalsIgnoreCase("System Associate"))
            e.insuranceScheme = "Scheme C";
        else if (e.salary >= 20000 && e.salary < 40000 && e.designation.equalsIgnoreCase("Programmer"))
            e.insuranceScheme = "Scheme B";
        else if (e.salary >= 40000 && e.designation.equalsIgnoreCase("Manager"))
            e.insuranceScheme = "Scheme A";
        else
            e.insuranceScheme = "No Scheme";
    }
}

public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        String designation = sc.next();
        Employee e = new Employee(id, name, salary, designation);
        EmployeeServiceImpl service = new EmployeeServiceImpl();
        service.assignScheme(e);
        System.out.println(e);
    }
}
