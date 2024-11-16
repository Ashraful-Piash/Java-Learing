package com.piashraful;

import java.util.List;
import java.util.stream.Collectors;

public class Java8MethodCheatSheet {
    public static void main(String[] args) {

        List<Employee> allEmployees = EmployeeDataBase.getAllEmployees();
//        for(Employee e: allEmployees){
//            System.out.println(e.getName());
//            System.out.println(e.getProjects());
            allEmployees.forEach(employee -> System.out.println(employee.getName() + " : " + employee.getSalary()));

        List<Employee> employeeListOfDev = allEmployees.stream()
                .filter(employee -> employee.getDept().equals("Development"))
                .collect(Collectors.toList());
        System.out.println("Employee list of devs: " + employeeListOfDev);

        List<Employee> male = allEmployees.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("male"))
                .collect(Collectors.toList());
        System.out.println("List of male employee" +male);


    }
}
