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

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int anId, String aName, double aSalary) {
        this.id = anId;
        this.name = aName;
        this.salary = aSalary;
    }

    public void setId(int anId) {
        this.id = anId;
    }

    public int getId() {
        return id;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double aSalary) {
        this.salary = aSalary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + id + " " + name + " " + salary;
    }

}
