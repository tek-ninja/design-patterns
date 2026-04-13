package SingleTon;

public class SynchronisedSingleTon {
    private SynchronisedSingleTon(){

    }
    private static SynchronisedSingleTon instance = null;

    public static SynchronisedSingleTon getInstance(){
        if(instance == null){
            synchronized (SynchronisedSingleTon.class){
                /*
                 If some threads say 5 threads passed the first check, then
                 after one thread exited the synchronized block, then it let the other
                 threads enter the synchronized block, so, this second check prevents
                 the other threads create another instance.
                 */
                if(instance == null ){
                    instance = new SynchronisedSingleTon();
                }
            }
        }
        return  instance;
    }
}
