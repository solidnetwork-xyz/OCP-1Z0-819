package xyz.solidnetwork.hr;

public class Department {
    public static final int MAX_CAPACITY = 10;

    private String name;
    private Employee[] employees;
    private int numEmployees;
    private double totalSalary;

    public Department(String aName) {
        this.name = aName;
        this.employees = new Employee[MAX_CAPACITY];
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee anEmployee) {
        if (isNotNull(anEmployee)) {
            if (!hasEmployees(numEmployees)) {
                employees[numEmployees] = anEmployee;
                numEmployees++;
                sumTotalSalary(anEmployee.getSalary());
            } else {
                if (!isMaxCapacity(numEmployees)) {
                    employees[numEmployees] = anEmployee;
                    numEmployees++;
                    sumTotalSalary(anEmployee.getSalary());
                }
            }
        }
    }

    private boolean isNotNull(Object input) {
        return null != input;
    }

    private boolean hasEmployees(int numEmployees) {
        return 0 < numEmployees;
    }

    private boolean isMaxCapacity(int numEmployees) {
        return numEmployees == MAX_CAPACITY;
    }

    public Employee[] listAllEmployees() {
        Employee[] allEmployees = new Employee[numEmployees];
        for (int idx = 0; idx < numEmployees; idx++) {
            allEmployees[idx] = employees[idx];
        }
        return allEmployees;
    }

    public int countEmployees() {
        return numEmployees;
    }

    public Employee getEmployeeById(int id) {
        for (int idx = 0; idx < numEmployees; idx++) {
            Employee employee = employees[idx];
            if (isNotNull(employee) && (id == employee.getId())) {
                return employee;
            }
        }
        return null;
    }

    private void sumTotalSalary(double aSalary) {
        totalSalary += aSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public double getAverageSalary() {
        return (0 == numEmployees) ? 0 : totalSalary / numEmployees;
    }

    @Override
    public String toString() {
        return "Department: " + name;
    }

}
