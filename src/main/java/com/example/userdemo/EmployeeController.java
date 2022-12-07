package com.example.userdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getEmployeesList(){
        List<Employee> employees=new ArrayList<>();
        Employee employee=new Employee(1, "Suhail","Delhi");
        Employee employee1=new Employee(2, "Elon","UK");
        Employee employee2=new Employee(3, "Musk","Mumbai");
        Employee employee3=new Employee(4, "Ronnie","London");
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }
}
