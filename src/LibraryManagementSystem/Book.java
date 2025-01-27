package LibraryManagementSystem;

public class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book reserved: " + getTitle());
    }

    public boolean checkAvailability() {
        return true;
    }
}
