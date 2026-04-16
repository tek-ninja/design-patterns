package Proxy;

public class RealImage {
    public RealImage(String file) {
        loadFromDisk(file); // expensive
    }

    private void loadFromDisk(String file) {
        System.out.println("Loaded from disk");
    }

    public void display() {
        System.out.println("Displaying image");
    }
}


/* My question and the explain
class RealImage {
    private String file;

    public RealImage(String file) {
        this.file = file; // lightweight now
    }

    public void display() {
        loadFromDisk(file); // expensive happens here
    }

    private void loadFromDisk(String file) {
        System.out.println(file);
    }
}

    🧠 What You Achieved
    Lazy loading ✅
    Simpler design ✅


    🚨 Where This Breaks in Real Systems
        1. ❌ No Control Layer

        You cannot do:

        Access control
        Logging
        Caching
        Rate limiting

        👉 Without modifying RealImage

        2. ❌ Violates Single Responsibility Principle

            RealImage now:

            Knows how to load
            Knows when to load

            👉 These are different concerns
          3. ❌ Cannot Add Cross-Cutting Concerns

            Suppose you want:

            log("Image accessed");
            authenticate(user);
            cache(file);

            👉 You’ll modify RealImage again and again

            💥 This is how code becomes messy in production
            4. ❌ No Transparency

                Client directly uses:

                RealImage img = new RealImage("a.jpg");

                👉 No way to intercept behavior
*/

/*
        🚀 What Proxy Gives You (That Your Approach Can’t)
        ✅ 1. Separation of Concerns
        RealImage → what to do
        Proxy → when/how to access

        ✅ 2. Add Features Without Changing Real Object
        public void display() {
            log();
            authenticate();

            if (realImage == null) {
                realImage = new RealImage(file);
            }

            realImage.display();
         ✅ 3. Open/Closed Principle

        👉 Extend behavior without modifying RealImage

        ✅ 4. Works for Third-Party / Legacy Code

        👉 What if you cannot modify RealImage?

        Your approach fails ❌
        Proxy works ✅

        ✅ 5. Used Heavily in Frameworks
        Spring AOP → proxies for transactions
        Hibernate → lazy loading proxies
        API gateways → request proxies
        }

*/