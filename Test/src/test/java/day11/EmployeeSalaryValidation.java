package day11;

import java.util.Scanner;

class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}

public class EmployeeSalaryValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        try {
            validateSalary(salary);
            System.out.println("Valid salary: " + salary);
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateSalary(double salary) throws EmployeeException {
        if (salary < 10000) {
            throw new EmployeeException("Salary must not be below 10000");
        }
    }
}
