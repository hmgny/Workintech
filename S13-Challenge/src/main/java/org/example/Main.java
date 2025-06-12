package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Healthplan healthPlan = new Healthplan(1, "Standard Plan", Plan.BASIC);
        System.out.println(healthPlan);

        String[] healthPlans = new String[3];
        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123", healthPlans);
        employee.addHealthPlan(0, "Standard Plan");
        System.out.println(employee);

        String[] developers = new String[3];
        Company company = new Company(1, "TechCorp", 100000.0, developers);
        company.addEmployee(0, "John Doe");
        System.out.println(company);

    }
}