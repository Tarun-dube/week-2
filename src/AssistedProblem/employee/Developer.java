package AssistedProblem.employee;

public class Developer extends Employee{
String language;
Developer(String name,int id,int salary,String language){
 this.name=name;
 this.id=id;
 this.salary=salary;
 this.language=language;
 }
// override function
public void details(){
   System.out.println("Name: "+name);
   System.out.println("Id: "+id);
   System.out.println("Salary: "+salary);
   System.out.println("Programmin Language: "+language);
      System.out.println("developer");

}

}
