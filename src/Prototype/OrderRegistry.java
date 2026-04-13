package Prototype;

import java.util.*;

class OrderRegistry {

    private static final Map<String, Order> registry = new HashMap<>();

    static {
        // Premium template
        Order premium = new Order();
        premium.basePrice = 0;
        premium.tax = 18;
        premium.deliveryFee = 50;
        premium.discount = 10;
        premium.items = new ArrayList<>();
        premium.paymentMode = "ONLINE";
        premium.status = "TEMPLATE";

        premium.pricingRules = new PricingRules(1.5, 18);
        premium.deliveryConfig = new DeliveryConfig(10, 30);

        registry.put("premium", premium);

        // Standard template
        Order standard = new Order();
        standard.basePrice = 0;
        standard.tax = 10;
        standard.deliveryFee = 30;
        standard.discount = 5;
        standard.items = new ArrayList<>();
        standard.paymentMode = "COD";
        standard.status = "TEMPLATE";

        standard.pricingRules = new PricingRules(1.0, 10);
        standard.deliveryConfig = new DeliveryConfig(5, 45);

        registry.put("standard", standard);
    }

    public static Order getOrder(String type) {
        return registry.get(type).clone(); // 🔥 Always clone
    }
}
