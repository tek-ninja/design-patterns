package SingleTon;

public class SynchronisedSingleTon {
    private SynchronisedSingleTon(){

    }
    private static SynchronisedSingleTon instance = null;

    public static SynchronisedSingleTon getInstance(){
        if(instance == null){
            synchronized (SynchronisedSingleTon.class){
                if(instance == null ){
                    instance = new SynchronisedSingleTon();
                }
            }
        }
        return  instance;
    }
}
