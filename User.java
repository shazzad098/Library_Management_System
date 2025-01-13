public class User {
    private String fullName;
    private String contactNumber;
    private String email;
    private String address;

    public User(String fullName, String contactNumber, String email, String address) {
        this.fullName = fullName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Name: " + fullName + ", Contact: " + contactNumber + ", Email: " + email + ", Address: " + address;
    }
}
