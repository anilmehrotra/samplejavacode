package lambda.runnable;

public class TestRunnableLambda {

	public static void main(String aa[]){
		Runnable run  = () -> {
			for(int i=0;i<4;i++){
			System.out.println("my thread name ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		};
		//Thread t1 = new Thread(() -> System.out.println("This is Lambda Thread"));
		
		//Thread t1 = new Thread(run);
		
		/************using inner class****************/
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("My Thread");				
			}
		});
		
		t1.start();
	}
}
