public class BorrowManagement {
    private BookManagement bookManagement;

    public BorrowManagement(BookManagement bookManagement) {
        this.bookManagement = bookManagement;
    }

    public void borrowBook(String id) throws LibraryException {
        Book book = bookManagement.getBookById(id);
        if (book == null) {
            throw new LibraryException("Book not found.");
        } else if (!book.isAvailable()) {
            throw new LibraryException("Book is already checked out.");
        } else {
            book.setAvailability(false);
            System.out.println();
            System.out.println("*** Book borrowed successfully! ***");
        }
    }

    public void returnBook(String id) throws LibraryException {
        Book book = bookManagement.getBookById(id);
        if (book == null) {
            throw new LibraryException("Book not found.");
        } else if (book.isAvailable()) {
            throw new LibraryException("Book is already available.");
        } else {
            book.setAvailability(true);
            System.out.println();
            System.out.println("*** Book returned successfully! ***");
        }
    }
}
