package Obeservor;

public class MobileObserver implements Observer {
    @Override
    public void update(int price) {
        System.out.println("Mobile updated: " + price);
    }
}
