package SingleTon;


/*In Java:
A class is NOT loaded into memory until it is actively used
So:
BasicSingleTon class loads first
        But Holder class is NOT loaded yet*/
public class BillPughSingleTon {
    private BillPughSingleTon(){

    }
    private static class Holder{
        private static final BillPughSingleTon instance = new BillPughSingleTon();
    }
    public static BillPughSingleTon getInstance(){
        return Holder.instance;
    }
}
