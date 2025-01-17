import java.util.*;
   
class Code4{

        public static class MovieTicket{
		  public
		  String name;
		  String  seat;
		  int price;
		  Scanner sc=new Scanner(System.in);
		  void book(){
		  seat="booked";
		  price=0;
		  
		  }
		  void detail(){
		  
		  System.out.println("Movie Name- "+name+", Seat No- "+seat+" and price- "+price);
		  
		  }
		  
		  MovieTicket(){
		     		  System.out.println("enter the details");
					  name=sc.nextLine();
					 seat =sc.next();
					  price=sc.nextInt();

		  }
		}
         
        public static void main(String[] args){
		    Code4.MovieTicket obj=new MovieTicket();
			
			obj.detail();
			obj.book();
			obj.detail();
			
			
		
		}
}