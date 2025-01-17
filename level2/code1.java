import java.util.*;
   
class Code1{

        public static class Student{
		  public
		  String name;
		  int  roll;
		  int marks;
		  Scanner sc=new Scanner(System.in);
		  void grade(){
		  if(marks>90) System.out.println("the grade is A");
		  else if(marks>80) System.out.println("the grade is B");
		  else if(marks>70) System.out.println("the grade is C");
		  else if(marks>60) System.out.println("the grade is D");
		  else if(marks>50) System.out.println("the grade is E");
		  else  System.out.println("the grade is F");
		  
		  }
		  void detail(){
		  
		  System.out.println("Name- "+name+", RollNo- "+roll+" and marks- "+marks);
		  grade();
		  }
		  
		  Student(){
		     		  System.out.println("enter the details");
					  name=sc.nextLine();
					 roll =sc.nextInt();
					  marks=sc.nextInt();

		  }
		}
         
        public static void main(String[] args){
		    Code1.Student obj=new Student();
			
			obj.detail();
		
		}
}