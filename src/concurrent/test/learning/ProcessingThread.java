package concurrent.test.learning;

class ProcessingThread implements Runnable {
    private int count;
    
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            //synchronized (this) {
                count++;
            //}
            
        }
    }
    
    public int getCount() {
        return this.count;
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
