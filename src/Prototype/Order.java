package Prototype;

import java.util.*;

class Order implements Cloneable {

    String userId;
    String address;

    String restaurantId;
    String restaurantName;

    double basePrice;
    double tax;
    double deliveryFee;
    double discount;

    List<String> items;

    String paymentMode;

    long timestamp;
    String status;

    PricingRules pricingRules;
    DeliveryConfig deliveryConfig;

    public Order clone() {
        Order copy = new Order();

        copy.userId = this.userId;
        copy.address = this.address;
        copy.restaurantId = this.restaurantId;
        copy.restaurantName = this.restaurantName;

        copy.basePrice = this.basePrice;
        copy.tax = this.tax;
        copy.deliveryFee = this.deliveryFee;
        copy.discount = this.discount;

        copy.paymentMode = this.paymentMode;
        copy.timestamp = System.currentTimeMillis();
        copy.status = "CREATED";

        // Deep copy
        copy.items = new ArrayList<>(this.items);

        copy.pricingRules = this.pricingRules.clone();
        copy.deliveryConfig = this.deliveryConfig.clone();

        return copy;
    }

    public void show() {
        System.out.println("User: " + userId +
                " | Restaurant: " + restaurantName +
                " | Items: " + items +
                " | Tax: " + tax +
                " | Delivery: " + deliveryFee +
                " | Status: " + status +
                " | Hash: " + this.hashCode());
    }
}