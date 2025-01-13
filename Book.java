public class Book {
    private String title;
    private String author;
    private String genre;
    private String id;
    private boolean isAvailable;

    public Book(String title, String author, String genre, String id) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean status) {
        isAvailable = status;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Genre: " + genre + ", ID: " + id +
                ", Availability: " + (isAvailable ? "Available" : "Checked Out");
    }
}
