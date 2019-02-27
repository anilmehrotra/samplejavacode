class BBB{
	String name;
	static{
		System.out.println("S BBB");
	}
	BBB(String name){
		this.name = name;
		System.out.println("P BBB");
	}
	BBB(){
		System.out.println("BBB");
	}
	{
		System.out.println("IIIBBB");
	}
}
public class AAA extends BBB{
	static int count =0;
	String name;
	static{
		System.out.println("S AAA");
	}
	AAA(String name){
		this.name =name;
		System.out.println("P AAA");
	}
	AAA(){
		super("");
		System.out.println("AAA");
	}
	{
		count++;
		System.out.println("IIIAAA");
	}
	public static void main(String aa[]){
		AAA a = new AAA();
		System.out.println("Prarameter");
		AAA an = new AAA("");
		System.out.println(AAA.count);
	}
}
