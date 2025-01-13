import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LibraryException {
        Scanner scanner = new Scanner(System.in);

        UserManagement userManagement = new UserManagement();
        BookManagement bookManagement = new BookManagement();
        BorrowManagement borrowManagement = new BorrowManagement(bookManagement);

        // Menu-driven system
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add User");
            System.out.println("2. Add Book");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Books");
            System.out.println("7. Display Users");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    userManagement.addUser();
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter book ID: ");
                    String id = scanner.nextLine();
                    bookManagement.addBook(title, author, genre, id);
                    break;
                case 3:
                    System.out.print("Enter search criteria (title/ID): ");
                    String criteria = scanner.nextLine();
                    bookManagement.searchBook(criteria);
                    break;
                case 4:
                    System.out.print("Enter book ID to borrow: ");
                    String borrowId = scanner.nextLine();
                    borrowManagement.borrowBook(borrowId);
                    break;
                case 5:
                    System.out.print("Enter book ID to return: ");
                    String returnId = scanner.nextLine();
                    borrowManagement.returnBook(returnId);
                    break;
                case 6:
                    bookManagement.displayBooks();
                    break;
                case 7:
                    userManagement.displayUsers();
                    break;
                case 8:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
