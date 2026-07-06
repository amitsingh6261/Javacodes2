class Order {
    String item;
    int quantity;

    // Initializer Block
    {
        System.out.println("New Order Started");
    }

    // Default Constructor
    Order() {
        this("Burger");
    }

    // Constructor with food item
    Order(String item) {
        this(item, 1);
    }

    // Constructor with food item and quantity
    Order(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;

        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Pizza", 2);
    }
}