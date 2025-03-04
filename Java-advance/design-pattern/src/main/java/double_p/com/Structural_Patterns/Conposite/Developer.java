package org.example.DesignPattern.Conposite;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Developer implements Employee {
    private String name;
    private int age;    
    private int salary;

    @Override
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
