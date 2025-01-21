

         public class Main{
  
	   
	   public static void main(String[] args){
	    
		
		 Book b1=new Book("chanakya niti","chanakya",01);
		
		Book.displayLibraryName();
		
		System.out.println("\n");
		
		if(b1 instanceof Book){
			b1.getDetail();
		}
		
		
		
	   }
	 
   }

  class Book{
       static String libraryName="Vivekananda laibrary";
	   
	   String title;
	   String author;
	   final int isbn;
	   static int count=0;
	   Book(String title,String author, int isbn){
	       this.title=title;
		   this.author=author;
		   this.isbn=isbn;
		   
	   }
	   
	  public static void displayLibraryName(){
	      System.out.println("The name of library is: "+libraryName);
	   }
	     public void getDetail(){
		   System.out.println("Book number:"+isbn);
		   System.out.println("Book name:"+title);
		   System.out.println("Author:"+author);
		   
	   }
	   }