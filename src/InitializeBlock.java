

public class InitializeBlock {
	static int i=0;
	String name;
	{
		i++;
		System.out.println(i);
	}
	static{
		System.out.println("test"+i);
	}
	
	public InitializeBlock(){
		System.out.println("const");
	}
	public InitializeBlock(String name){
		this.name= name;
		System.out.println("const name");
	}
	
	public static void main(String []aa){
		InitializeBlock block1 = new InitializeBlock();
		InitializeBlock block2 = new InitializeBlock();
		InitializeBlock blocl3 = new InitializeBlock("xxx");
	}
}
