package Obeservor;

import java.util.ArrayList;
import java.util.List;

class Stock implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int price;
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void removeObserver(Observer o) {
          observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }
    /* void updatePrice() {
         mobile.display();
         web.display();
         email.send();
         👉 Problems:
            Tight coupling
            Hard to add/remove listeners
            Violates Open/Closed Principle
     }*/


}
