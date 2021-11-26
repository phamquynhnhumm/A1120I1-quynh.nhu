package newCaseStudy.Models.service;


import newCaseStudy.Models.entity.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    public void addNewEmployee(){
        Employee employee1 = new Employee("1001","Bich Tram",13,"38 Do Thuc Tinh");
        Employee employee2 = new Employee("1002","Bich Tram",13,"38 Do Thuc Tinh");
        Employee employee3 = new Employee("1003","Bich Tram",13,"38 Do Thuc Tinh");
        Employee employee4 = new Employee("1004","Bich Tram",13,"38 Do Thuc Tinh");
        Employee employee5 = new Employee("1005","Bich Tram",13,"38 Do Thuc Tinh");
        Employee employee6 = new Employee("1006","Bich Tram",13,"38 Do Thuc Tinh");
        Employee employee7 = new Employee("1007","Bich Tram",13,"38 Do Thuc Tinh");
        Employee employee8 = new Employee("1008","Bich Tram",13,"38 Do Thuc Tinh");
        Map<String,Employee> employeeMap = new HashMap();
        employeeMap.put(employee1.getId(),employee1);
        employeeMap.put(employee2.getId(),employee2);
        employeeMap.put(employee3.getId(),employee3);
        employeeMap.put(employee4.getId(),employee4);
        employeeMap.put(employee5.getId(),employee5);
        employeeMap.put(employee6.getId(),employee6);
        employeeMap.put(employee7.getId(),employee7);
        employeeMap.put(employee8.getId(),employee8);
        for (int i=0;i<employeeMap.size();i++){
            System.out.println(employeeMap.get(1001+i+""));
        }

    }
}
