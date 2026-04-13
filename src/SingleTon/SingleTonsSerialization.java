package SingleTon;

import java.io.Serializable;

public class SingleTonsSerialization implements Serializable {
    private static final long serialVersionUID = 1L;

    private SingleTonsSerialization(){}

    private static SingleTonsSerialization instance = null;

    public static SingleTonsSerialization getInstance(){
        if(instance == null){
            instance = new SingleTonsSerialization();
        }
        return instance;
    }
    protected Object readResolve(){
        return getInstance();
    }
}
