

         public class Main{
  
	   
	   public static void main(String[] args){
	    
		
		Student s1=new Student("Tarun dubey",1,"first");
        Student	 s2=new Student("Sankalp",2,"fifth");
		Student s3=new Student("Pushpa",3,"third");
		Student s4=new Student("Sajay",4,"second");
		
		
		Student.getTotalStudent();
		
		System.out.println("\n");
		
		if(s1 instanceof Student){
			s1.getDetail();
		}
		System.out.println("\n");
		if(s2 instanceof Student){
			s2.getDetail();
		}
		System.out.println("\n");
		if(s3 instanceof Student){
			s3.getDetail();
		}
		System.out.println("\n");
		if(s4 instanceof Student){
			s4.getDetail();
		}
		
	   }
	 
   }

  class Student{
       static String universityName="RGPV";
	   
	   String name;
	   final int rollNo;
	   
	   String grade;
	   static int count=0;
	   
	   
	   Student(String name, int rollNo,String grade){
	       this.name=name;
		   this.rollNo=rollNo;
		   this.grade=grade;
		   count++;
	   }
	   
	  public static void getTotalStudent(){
	      System.out.println("total no of students are: "+count);
	   }
	   
	     public void getDetail(){
		   System.out.println("Name:"+name);
		   System.out.println("Student rollNo:"+rollNo);
		   System.out.println("Grade:"+grade);
		   
		   
	   }
	   }