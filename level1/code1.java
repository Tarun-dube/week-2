import java.util.*;
   
class first{

        public static class Employee{
		  public
		  String name;
		  int id;
		  int salary;
		  Scanner sc=new Scanner(System.in);
		  void detail(){
		  
		  System.out.println("Name- "+name+", id- "+id+" and salary- "+salary);
		  }
		  
		  Employee(){
		     		  System.out.println("enter the details");
					  name=sc.nextLine();
					  id=sc.nextInt();
					  salary=sc.nextInt();

		  }
		}
         
        public static void main(String[] args){
		    first.Employee obj=new Employee();
			
			obj.detail();
		
		}
}