package SingleTon;

public class BasicSingleTon {
    private BasicSingleTon(){

    }
    private static  BasicSingleTon  instance = null;

    public static BasicSingleTon getInstance(){
        if(instance == null){
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            instance = new BasicSingleTon();
        }
        return  instance;
    }
}
