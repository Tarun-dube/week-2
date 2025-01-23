import java.util.*;


class code1{
    public static void main(String[] args){
	  Book b1=new Book("chanakya niti","chanakya");
	  Book b2=new Book("Mahabharat","Vedvyas");
	  Book b3=new Book("Ramayan","valmiki");
	  
	  //first library
	  Library l1=new Library();
	   l1.set(b1);
	   l1.set(b2);
	   l1.set(b3);
	   
	   //print books of first library
	   System.out.println("The books in first library are");
	   
	   l1.get();
	   
	   //second library
	   Library l2=new Library();
	   
	   l2.set(new Book("Think and grow rich","Napoleon Hill and Rosa LeeBeeland"));
	   l2.set(new Book("The power of subconscious mind","Joseph Murphy"));
	   l2.set(new Book("Sherlock Holmes","Arthur Conan Doyle"));
	   
	  // list of books in library 2
	       	   System.out.println("\n");

	  	   System.out.println("The books in second library are");
		   	       	   


	   l2.get();
	  
	}
}

class Library{
 ArrayList<Book> books=new ArrayList<Book>();

public void set(Book b1){
     books.add(b1);
}

public void get(){
for(Book book:books){
  System.out.println("Title:"+book.title+" Author:"+book.author);
  }
}

}


class Book{

  String title;
  String author;
  
  Book(String title,String author){
        this.title=title;
		this.author=author;
  }
  
}