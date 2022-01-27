package com.company.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    List<Employee> employees;
    Map<String, Double> employeeAverageSalary;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        employees = new ArrayList<>();
        employees.add(new Employee("Developer", 10, "yoshi"));
        employees.add(new Employee("Builder", 20, "lee"));
        employees.add(new Employee("Chef", 30, "warrio"));
        employees.add(new Employee("Developer", 60, "don"));
        employees.add(new Employee("Chef", 10, "ra"));
        employees.add(new Employee("Builder", 10, "leo"));
        employees.add(new Employee("Developer", 100, "ralph"));
        employeeAverageSalary = Employee.getJobAndItsAverageSalary(employees);
    }

    @org.junit.jupiter.api.Test
    void checkAverageSalaryOfChefs() {
        Double chefAverageSalary = employeeAverageSalary.get("Chef");
        Double expectedValue = 20.0;
        assertEquals(expectedValue, chefAverageSalary);
    }
}