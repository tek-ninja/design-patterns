package Obeservor;

public class WebObserver implements Observer{
    @Override
    public void update(int price) {
        System.out.println("Web updated: " + price);
    }
}
