package AssistedProblem.employee;

public class Employees{
public static void main(String[] args){
       //employee
	   Employee employee=new Employee();
	   
	   //manager
	   Manager manager=new Manager("Tarun", 01,30000000,12);
	   manager.details();
	   
	   //developer
	   Developer developer=new Developer("Sankalp",02,20000003,"java");
	   developer.details();
	   
	   //intern
	   Intern intern=new Intern("Pushpa",03,300000);
	   intern.details();
	   
	   
	   
}
}

