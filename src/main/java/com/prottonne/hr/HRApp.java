package com.prottonne.hr;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("HR App Starts");
        Department departmentEducation = new Department("Department Education");
        System.out.println(departmentEducation);

        for (Employee employee : departmentEducation.listAllEmployees()) {
            System.out.println(employee);
        }

        Employee empAnn = new Employee(101, "Ann", 1234.56);
        Employee empBob = new Employee(102, "Bob", 1200.34);
        Employee empRay = new Employee(103, "Ray", 1122.33);

        departmentEducation.addEmployee(empAnn);
        departmentEducation.addEmployee(empBob);
        departmentEducation.addEmployee(empRay);

        departmentEducation.getEmployeeById(101);
        departmentEducation.getEmployeeById(102);
        departmentEducation.getEmployeeById(103);
        departmentEducation.getEmployeeById(104);

        for (Employee employee : departmentEducation.listAllEmployees()) {
            System.out.println(employee);
        }

        System.out.println("Total Salary: " + departmentEducation.getTotalSalary());

        System.out.println("Average Salary: " + departmentEducation.getAverageSalary());
    }

}
