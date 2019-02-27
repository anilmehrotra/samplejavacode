package lambda.pkgtest;

@FunctionalInterface
public interface MyLambda {
	String concateString(String s1, String s2);
	//void add(String s1, String s2);
	default void add(){
		System.out.println("Test");
	}
}
