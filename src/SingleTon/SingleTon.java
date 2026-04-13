package SingleTon;

//✔ Thread-safe by default
//JVM guarantees single instance
//✔ Safe from serialization
//No need for readResolve()
//✔ Safe from reflection
//JVM prevents creating enum instances via reflection

public enum SingleTon {
    INSTANCE;

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
