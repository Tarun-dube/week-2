package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department {
    int workingHours;
    String department;

    PartTimeEmployee(int emdId,String name,int salary,int workingHours) {
        super(emdId,name,salary);
        this.workingHours = workingHours;

    }
    //@Override
    int calculateSalary() {
        return (getBaseSalary()*workingHours);
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("total salary: " +calculateSalary() );
        System.out.println("department name: " +getDepartment());
    }
}
