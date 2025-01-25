package AssistedProblem.employee;

public class Manager extends Employee{
int teamsize;

 Manager(String name,int id,int salary,int teamsize){
 this.name=name;
 this.id=id;
 this.salary=salary;
 this.teamsize=teamsize;
 }

// override function
public void details(){
   System.out.println("Name: "+name);
   System.out.println("Id: "+id);
   System.out.println("Salary: "+salary);
   System.out.println("Team Size: "+teamsize);
      System.out.println("HierarchicalInheritence.Manager");

}

}
