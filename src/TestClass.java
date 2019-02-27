
public class TestClass {

	/*public void test() {
		// TODO Auto-generated method stub
		
	}
	
	public void display() {
		// TODO Auto-generated method stub
		
	}*/
	
	public void doProcess(int i,TestInterface ti){
		ti.process(i);
	}
	
	public static void main(String []aa){
		TestClass tc = new TestClass();
		tc.doProcess(10, j -> {System.out.println("value of i is : "+j);
		System.out.println("this");});
	}
}
