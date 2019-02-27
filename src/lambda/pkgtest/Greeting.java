package lambda.pkgtest;

public class Greeting {
	
	public void greet(Greeter greeter){
		//System.out.println("Greeting");
		greeter.perform();
	}
	
	public static void main(String []args){
		Greeting greeting = new Greeting();
		//greeting.greet();
		
		/*********by implementing a class*******/
		Greeter gInterface = new GreetImpl();
		greeting.greet(gInterface);
		
		greeting.greet(() -> System.out.println("Greeting"));
		
		/*********by anonymous class*********/
		Greeter greetAnoymous = new Greeter() {
			@Override
			public void perform() {
				System.out.println("Greeting");
			}
		};
		greetAnoymous.perform();
		
		
		/*********by Lambda expression*********/
		Greeter greetFuncation =  () -> System.out.println("Greeting");
		greetFuncation.perform();
		
		
		
		MyLambda concateString = ( s1,  s2) -> s1+s2;
		System.out.println("=== "+concateString.concateString("my ","name"));
	}

	
	
	
	
	/*public void greett(() -> System.out.println("")){
	}*/
	
	//doubleNo = (int a) -> a*2;
	//addFuntion = (int a, int b) -> a+b;
	
	/*safeDivide = (int a,int b) -> {
		if(b==0) return 0;
		return a/b;
	};*/
	
	//stringlengthCount = (String s) -> s.length();
}

