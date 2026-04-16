package Proxy;

public class Client {
    void  main(){

    /*
     RealImage img = new RealImage("photo.jpg");
        img.display();
     🔥 Problems
        1. ❌ Expensive Operation Happens Always
        Image loads even if not used
        2. ❌ No Access Control
        Anyone can create and use it
        3. ❌ No Logging / Caching
        No control layer*/
        Image img = new ProxyImage("photo.jpg");
        img.display(); // loads only now
    }

}
