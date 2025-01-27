package LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public void reserveItem() {
        System.out.println("DVD reserved: " + getTitle());
    }

    public boolean checkAvailability() {
        return false;
    }
}
