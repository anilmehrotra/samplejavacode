class SuperClass{
	public void printInteger(int i){
		System.out.println("SuperClassfff");
	}
}
public class MainClass extends SuperClass {
	
	//@Override
	public void printInteger(Integer i){
		System.out.println("MainClasskkk");
	}

	public static void main(String[] args) {
		SuperClass sc = new MainClass();
		int i = 9 ;
		sc.printInteger(9);
		sc.printInteger(i);
	}
}
