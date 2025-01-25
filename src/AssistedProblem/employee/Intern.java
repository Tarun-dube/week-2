package AssistedProblem.employee;

public class Intern extends Employee{
Intern(String name,int id,int salary){
 this.name=name;
 this.id=id;
 this.salary=salary;
 }
// override function
public void details(){
   System.out.println("Name: "+name);
   System.out.println("Id: "+id);
   System.out.println("Salary: "+salary);
   System.out.println("HierarchicalInheritence.Intern");
}


}
