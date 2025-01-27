package EmployeeManagementSystem;

public abstract class Employee implements Department {
    private int empID;
    private String Name;
    private int baseSalary;
    String department;



    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    Employee(int empID, String Name, int baseSalary) {
        this.empID = empID;
        this.Name = Name;
        this.baseSalary = baseSalary;

    }

    //abstract method.
    abstract int calculateSalary();

    @Override
    public String getDepartment() {
        return this.department;
    }

    @Override
    public void assingDepartment(String department) {
        this.department = department;
    }
    //concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + Name);
        System.out.println("Base Salary: " + baseSalary);

    }


}
