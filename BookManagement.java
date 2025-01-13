import java.util.HashMap;
import java.util.Map;

public class BookManagement {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(String title, String author, String genre, String id) throws LibraryException {
        if (books.containsKey(id)) {
            System.out.println();
            throw new LibraryException("Book ID already exists. Cannot add the book.");
        }
        books.put(id, new Book(title, author, genre, id));
        System.out.println();
        System.out.println("*** Book added successfully! ***");
    }

    public void searchBook(String criteria) throws LibraryException {
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(criteria) || book.getId().equals(criteria)) {
                System.out.println(book);
                return;
            }
        }
        throw new LibraryException("Book not found.");
    }

    public Book getBookById(String id) {
        return books.get(id);
    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }
}
