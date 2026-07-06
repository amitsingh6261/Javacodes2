class UserRegistration {
    String username;

    // Instance Initializer Block
    {
        System.out.println("Registration Process Started");
    }

    // Default Constructor
    UserRegistration() {
        this("Guest User");   // Constructor Chaining
    }

    // Parameterized Constructor
    UserRegistration(String username) {
        this.username = username;
        System.out.println("Username: " + this.username);
        System.out.println("Account Created Successfully");
    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration("Rahul");
    }
}