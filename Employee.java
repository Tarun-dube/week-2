

         public class Main{
  
	   
	   public static void main(String[] args){
	    
		
		Employee e1=new Employee("Tarun dubey",01,"software developer");
		Employee e2=new Employee("Sankalp",02,"software intern");
		Employee e3=new Employee("Pushpa",03,"software developer");
		Employee e4=new Employee("Sajay",04,"senior software developer");
		
		
		Employee.displayTotalEmployees();
		
		System.out.println("\n");
		
		if(e1 instanceof Employee){
			e1.getDetail();
		}
		System.out.println("\n");
		if(e2 instanceof Employee){
			e2.getDetail();
		}
		System.out.println("\n");
		if(e3 instanceof Employee){
			e3.getDetail();
		}
		System.out.println("\n");
		if(e4 instanceof Employee){
			e4.getDetail();
		}
		
	   }
	 
   }

  class Employee{
       static String companyName="Capgemini";
	   
	   String name;
	   final int id;
	   String designation;
	   static int count=0;
	   
	   
	   Employee(String name, int id,String designation){
	       this.name=name;
		   this.id=id;
		   this.designation=designation;
		   count++;
	   }
	   
	  public static void displayTotalEmployees(){
	      System.out.println("total no of employees are: "+count);
	   }
	     public void getDetail(){
		   System.out.println("Name:"+name);
		   System.out.println("Employee id:"+id);
		   System.out.println("Designation:"+designation);
		   
	   }
	   }