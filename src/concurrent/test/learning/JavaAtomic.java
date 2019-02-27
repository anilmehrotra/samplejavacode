package concurrent.test.learning;

public class JavaAtomic {
    
    public static void main(String[] args) throws InterruptedException {
        
        //ProcessingThread pt = new ProcessingThread();
        ProcessingThreadUsingAtomic pt = new ProcessingThreadUsingAtomic();
        Thread t1 = new Thread(pt, "t1");
        
        Thread t2 = new Thread(pt, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount());
    }
}
