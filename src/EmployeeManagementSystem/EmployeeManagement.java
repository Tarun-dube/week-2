package EmployeeManagementSystem;

public class EmployeeManagement {
    public static void main(String[] args) {

        FullTimeEmployee e1=new FullTimeEmployee(1,"Tarun",300000,4);
        e1.assingDepartment("Developer");
           e1.displayDetails();


           PartTimeEmployee e2=new PartTimeEmployee(2,"pushpa",10000,6);
        e2.assingDepartment("Sales");
           e2.displayDetails();

    }
}
