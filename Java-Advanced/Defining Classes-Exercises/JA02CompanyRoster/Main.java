package _12DefiningClassesExercises.JA02CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String[] date = scanner.nextLine().split("\\s+");
            String name = date[0];
            double salary = Double.parseDouble(date[1]);
            String position = date[2];
            String employeeDepartment = date[3];

            Employee employee = null;
            switch (date.length) {
                case 4:
                    employee = new Employee(name, salary, position, employeeDepartment);
                    break;
                case 5:
                    if (date[4].contains("@")) {
                        String employeeEmail = date[4];
                        employee = new Employee(name, salary, position, employeeDepartment, employeeEmail);
                    } else {
                        int age = Integer.parseInt(date[4]);
                        employee = new Employee(name, salary, position, employeeDepartment, age);
                    }
                    break;
                case 6:
                    String email = date[4];
                    int age = Integer.parseInt(date[5]);
                    employee = new Employee(name, salary, position, employeeDepartment, email, age);
                    break;
            }
            boolean departmentExists = departments
                    .stream()
                    .anyMatch(department -> department.getName().equals(employeeDepartment));

            if (!departmentExists) {
                Department department = new Department(employeeDepartment);
                departments.add(department);
            }
            Department currentDepartment = departments
                    .stream()
                    .filter(depart -> depart.getName().equals(employeeDepartment))
                    .findFirst()
                    .get();
            currentDepartment.getEmployees().add(employee);
        }

            Department highestPaidDepart = departments
                    .stream()
                    .max(Comparator.comparingDouble(Department::calculateAverage))
                    .get();
            System.out.printf("Highest Average Salary: %s%n", highestPaidDepart.getName());

            highestPaidDepart.getEmployees()
                    .stream()
                    .sorted((first, second) -> Double.compare(second.getSalary(), first.getSalary()))
                    .forEach(System.out::println);



    }
}
