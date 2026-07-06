class BankAccount {
    String customerName;
    double balance;
    String accountType;

    // Initializer Block
    {
        accountType = "Savings Account";
        System.out.println("Account Initialization Started");
    }

    // Default Constructor
    BankAccount() {
        this("Guest");
    }

    // Constructor with Customer Name
    BankAccount(String customerName) {
        this(customerName, 0);
    }

    // Constructor with Customer Name and Balance
    BankAccount(String customerName, double balance) {
        this.customerName =