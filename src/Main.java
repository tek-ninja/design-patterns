import SingleTon.BasicSingleTon;
import SingleTon.BillPughSingleTon;
import SingleTon.SynchronisedSingleTon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Set<Integer> instanceHashes = new HashSet<>();
    Runnable task = ()->{
        SynchronisedSingleTon basicSingleTon = SynchronisedSingleTon.getInstance();
        int hash  = System.identityHashCode(basicSingleTon);
        synchronized (instanceHashes){
            instanceHashes.add(hash);
        }
        System.out.println(Thread.currentThread().getName() + " -> " + hash);
    };
    Thread [] threads = new Thread[50];
    for(int i = 0;i<threads.length;i++){
        threads[i] = new Thread(task);
        threads[i].start();
    }
    System.out.println(instanceHashes.size());
}
