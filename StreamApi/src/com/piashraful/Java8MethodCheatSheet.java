package com.piashraful;

import java.util.List;

public class Java8MethodCheatSheet {
    public static void main(String[] args) {

        List<Employee> allEmployees = EmployeeDataBase.getAllEmployees();
//        for(Employee e: allEmployees){
//            System.out.println(e.getName());
//            System.out.println(e.getProjects());
            allEmployees.forEach(employee -> System.out.println(employee.getName() + " : " + employee.getSalary()));
        }
}
