import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManagement {
    private List<User> users = new ArrayList<>();

    // Method to manually add users
    public void addUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        User user = new User(fullName, contactNumber, email, address);
        users.add(user);

        System.out.println();
        System.out.println("*** User added successfully! ***");
    }

    // Display all registered users
    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println();
            System.out.println("*** No users are registered. ***");
        } else {
            System.out.println("*** Registered Users: ***");
            for (User user : users) {
                System.out.println();
                System.out.println(user);
            }
        }
    }
}
