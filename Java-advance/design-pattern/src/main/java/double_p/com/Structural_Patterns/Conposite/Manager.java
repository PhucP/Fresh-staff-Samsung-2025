package org.example.DesignPattern.Conposite;

import java.util.List;

public class Manager{
    private String name;
    private List<Employee> employees;

    public void AdjustSalary(int ratio) {
        employees.forEach(employee -> {
            Developer developer = (Developer) employee;
            developer.setSalary(developer.getSalary()*ratio/100 +  developer.getSalary()*ratio);
        });
    }

    public void showDetails() {
        System.out.println("Manager Name: " + name);
        employees.forEach(Employee::showDetails);
    }
}
