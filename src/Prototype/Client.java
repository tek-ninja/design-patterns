package Prototype;

public class Client {

     void main(String[] args) {

        // User 1 places order
        Order order1 = OrderRegistry.getOrder("premium");
        order1.userId = "user1";
        order1.restaurantName = "KFC";
        order1.items.add("Burger");
        order1.items.add("Fries");

        // User 2 places order
        Order order2 = OrderRegistry.getOrder("premium");
        order2.userId = "user2";
        order2.restaurantName = "Dominos";
        order2.items.add("Pizza");

        order1.show();
        order2.show();

        // Verify different instances
        System.out.println("\nSame object? " + (order1 == order2));

        // Verify deep copy (important)
        order1.items.add("Coke");

        System.out.println("\nAfter modifying order1:");
        order1.show();
        order2.show(); // should NOT be affected
    }
}
