package lambda.pkgtest;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		/*StringLengthLambda stringLengthLambda = s -> s.length();
		System.out.println(stringLengthLambda.getLength("myname"));*/
		
		printLambda(()-> 0);
	}
	
	public static void printLambda(StringLengthLambda l){
		System.out.println(l.getLength());
	}
	
	interface StringLengthLambda{
		//int getLength(String s);
		int getLength();
	}
}
