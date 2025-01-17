import java.util.*;
   
class Code3{

        public static class Book{
		  public
		  String title;
		  String author;
		  int price;
		  Scanner sc=new Scanner(System.in);
		  void detail(){
		  
		  System.out.println("Name- "+title+", author- "+author+" and price- "+price);
		  }
		  
		  Book(){
		     		  System.out.println("enter the details");
					  title=sc.nextLine();
					  author=sc.nextLine();
					  price=sc.nextInt();

		  }
		}
         
        public static void main(String[] args){
		    Code3.Book obj=new Book();
			
			obj.detail();
		
		}
}