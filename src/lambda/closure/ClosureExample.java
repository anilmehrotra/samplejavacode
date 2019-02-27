package lambda.closure;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		ClosureExample closureExample = new ClosureExample();
		/*closureExample.doProcess(a, i -> {
			System.out.println(i + b);
			 //System.out.println(this);
			});*/
		
		closureExample.execute();
	}

	public void doProcess(int a, Process p) {
		p.process(a);
	}
	
	public void execute(){
		int a=10;
		doProcess(a, i -> {
			System.out.println(i);
			 System.out.println(this);
			});
	}
	
	public String toString(){
		return "this is closure";
		
	}
}



interface Process {
	public void process(int i);
}
