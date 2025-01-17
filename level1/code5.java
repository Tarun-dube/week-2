import java.util.*;
   
class Code5{

        public static class Moblie{
		  public
		  String brand;
		  String model;
		  int price;
		  Scanner sc=new Scanner(System.in);
		  void detail(){
		  
		  System.out.println("Brand- "+brand+", Model- "+model+" and perice- "+price);
		  }
		  
		  Moblie(){
		     		  System.out.println("enter the details");
					  brand=sc.nextLine();
					 model =sc.next();
					  price=sc.nextInt();

		  }
		}
         
        public static void main(String[] args){
		    Code5.Moblie obj=new Moblie();
			
			obj.detail();
		
		}
}