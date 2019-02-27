package lambda.pkgtest;

public class GreetImpl implements Greeter {

	@Override
	public void perform() {
		System.out.println("Greeting");
	}
}
