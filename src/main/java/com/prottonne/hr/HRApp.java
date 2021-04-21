/*
 * MIT License
 *
 * Copyright (c)  2021 Jose Osuna
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

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
