import java.util.*;
   
class Code2{

        public static class Circle {
		  public
		  int radius;
		  Scanner sc=new Scanner(System.in);
		  double area(){
		    double a=3.14*radius*radius;
			return a;
		  }
		  
		  double circumference(){
		    double c=2*3.14*radius;
			return c;
		  }
		  
		  Circle(){
		  System.out.println("enter the radius");
		  radius=sc.nextInt();
		  
		  }
		   
		}
         
        public static void main(String[] args){
		
			Scanner sc=new Scanner(System.in);

		    Code2.Circle obj=new Circle();
			
			System.out.println("the area of circle is - "+obj.area());
			System.out.println("the circumference of circle is - "+obj.circumference());
		
		}
}