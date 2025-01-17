import java.util.*;
   
class Code4{

        public static class Items{
		  public
		  int code;
		  String name;
		  int price;
		  Scanner sc=new Scanner(System.in);
		  void detail(){
		  
		  System.out.println("Item code- "+code+", name- "+name+" and price- "+price);
		  }
		  
		  Items(){
		     		  System.out.println("enter the details");
					  code=sc.nextInt();
					  name=sc.next();
					  price=sc.nextInt();

		  }
		  
		  int cost(int a){
		    return price*a;
		  }
		}
         
        public static void main(String[] args){
		    Scanner sc=new Scanner(System.in);
			
			             System.out.println("enter the quantity");
			int a=sc.nextInt();

		    Code4.Items obj=new Items();



			obj.detail();
			
		   System.out.println("the total cost is- "+ obj.cost(a));
		
		}
}