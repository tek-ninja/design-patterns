package Obeservor;

public class Client {
    void main(){
        Stock stock = new Stock();

        stock.addObserver(new MobileObserver());
        stock.addObserver(new WebObserver());

        stock.setPrice(100);

        stock.notifyObservers();
    }
}
