package day14;

package day13;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

class EmployeeService {
    void writeEmployees(List<Employee> employees, String filename) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        for (Employee e : employees) {
            oos.writeObject(e);
        }
        oos.close();
    }
    void readEmployees(String filename) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        try {
            while (true) {
                Employee e = (Employee) ois.readObject();
                System.out.println(e);
            }
        } catch (EOFException ex) {
        }
        ois.close();
    }
}

public class EmployeeFileDemo {
    public static void main(String[] args) throws Exception {
        EmployeeService service = new EmployeeService();
        List<Employee> list = Arrays.asList(
            new Employee(1, "Alice", 12000),
            new Employee(2, "Bob", 15000),
            new Employee(3, "Charlie", 18000)
        );
        String filename = "employees.dat";
        service.writeEmployees(list, filename);
        service.readEmployees(filename);
    }
}

