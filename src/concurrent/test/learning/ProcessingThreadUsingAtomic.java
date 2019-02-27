package concurrent.test.learning;

import java.util.concurrent.atomic.AtomicInteger;

class ProcessingThreadUsingAtomic implements Runnable {
    private AtomicInteger count = new AtomicInteger();
    
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            //synchronized (this) {
                count.incrementAndGet();
            //}
            
        }
    }
    
    public int getCount() {
        return this.count.get();
    }
    
    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
