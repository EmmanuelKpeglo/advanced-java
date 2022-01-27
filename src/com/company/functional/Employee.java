package com.company.functional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String job;
    private double salary;
    private String name;

    public Employee(String job, double salary, String name) {
        this.job = job;
        this.salary = salary;
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Map<String, Double> getJobAndItsAverageSalary(List<Employee> employees) {
        Map<String, Double> jobAndAverageSalary = new HashMap<>();
        jobAndAverageSalary = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getJob(), Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(employeeMap -> employeeMap.getKey(),
                        employeeMap -> employeeMap.getValue()
                                .stream()
                                .map(employee -> employee.getSalary())
                                .reduce(0d, (subtotal, salary) -> subtotal + salary)/employeeMap.getValue().stream().count()
                        ));

        return jobAndAverageSalary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Developer", 10, "yoshi"));
        employees.add(new Employee("Builder", 20, "lee"));
        employees.add(new Employee("Chef", 30, "warrio"));
        employees.add(new Employee("Developer", 60, "don"));
        employees.add(new Employee("Chef", 10, "ra"));
        employees.add(new Employee("Builder", 10, "leo"));
        employees.add(new Employee("Developer", 100, "ralph"));

        Map<String, Double> employeeAverageSalary = Employee.getJobAndItsAverageSalary(employees);
        System.out.println(employeeAverageSalary);
    }
}
