import java.util.*;
   
class Code5{

        public static class ItemCart{
		  public
		  String name;
		  int  price;
		  int quantity;
		  Scanner sc=new Scanner(System.in);
		  
		  void add(int n){
		 quantity+=n;
		  
		  }
		  void remove(int n){
		  quantity-=n;
		 
		 
		  }
		  void cost(){
		  System.out.println("The total cost is "+price*quantity);
		  }
		 ItemCart(){
		     		  System.out.println("enter the details");
					  name=sc.nextLine();
					 price =sc.nextInt();
					  quantity=sc.nextInt();

		  }
		}
         
        public static void main(String[] args){
		    Code5.ItemCart obj=new ItemCart();
			
			obj.cost();
			obj.add(4);
			obj.cost();
			obj.remove(3);
			obj.cost();
		
		}
}