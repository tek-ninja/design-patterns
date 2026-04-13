import SingleTon.SingleTonsSerialization;

import java.io.*;


public class Client {
    void main()  {
        SingleTonsSerialization singleTonsSerialization = SingleTonsSerialization.getInstance();
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleTon.obj"));
            objectOutputStream.writeObject(singleTonsSerialization);
            objectOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }// Deserialize from file
       try{
           ObjectInputStream in = new ObjectInputStream(
                   new FileInputStream("singleton.obj"));
           SingleTonsSerialization instance2 = (SingleTonsSerialization) in.readObject();
           // Compare instances
           System.out.println("Instance 1 hash: " + singleTonsSerialization.hashCode());
           System.out.println("Instance 2 hash: " + instance2.hashCode());

           System.out.println("Same instance? " + (singleTonsSerialization == instance2));
           in.close();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }





    }
}
