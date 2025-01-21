

         public class Main{
  
	   
	   public static void main(String[] args){
	    
		
		Hospital p1=new Hospital("Tarun dubey",21,"cancer");
		Hospital p2=new Hospital("Sankalp",22,"tuberculosis");
		Hospital p3=new Hospital("Pushpa",33,"cold");
		Hospital p4=new Hospital("Sajay",24,"typhoid");
		
		
		Hospital.getTotalPatient();
		
		System.out.println("\n");
		
		if(p1 instanceof Hospital){
			p1.getDetail();
		}
		System.out.println("\n");
		if(p2 instanceof Hospital){
			p2.getDetail();
		}
		System.out.println("\n");
		if(p3 instanceof Hospital){
			p3.getDetail();
		}
		System.out.println("\n");
		if(p4 instanceof Hospital){
			p4.getDetail();
		}
		
	   }
	 
   }

  class Hospital{
       static String hospitalName="City Hospital";
	   
	   String name;
	   int age;
	   //final int id;
	   String ailment;
	   static int count=0;
	   
	   
	   Hospital(String name, int age,String ailment){
	       this.name=name;
		   this.age=age;
		   this.ailment=ailment;
		   count++;
	   }
	   
	  public static void getTotalPatient(){
	      System.out.println("total no of patients are: "+count);
	   }
	     public void getDetail(){
		   System.out.println("Name:"+name);
		   //System.out.println("Patient id:"+id);
		   System.out.println("Age:"+age);
		   System.out.println("Ailment:"+ailment);
		   
	   }
	   }