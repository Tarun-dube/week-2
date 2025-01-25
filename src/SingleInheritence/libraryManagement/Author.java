package SingleInheritence.libraryManagement;

public class Author extends Book {
    String name;
    String bio;
     public Author(String name,String title,int publicationYear, String bio) {
         super(title,publicationYear);
       this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
            super.displayInfo();
    }
}
