package SingleInheritence.libraryManagement;



public class LibraryManagement {
    public static void main(String[] args) {
        //book class
        Book book=new Book("physics",2019);
        Book book2=new Book("math",2019);
        book.displayInfo();
        book2.displayInfo();

        //author class
        Author author=new Author("HC Verma","physcis",2019,"physician");
         author.displayInfo();
    }
}

