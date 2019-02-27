package lambda.exception.handling;

import java.util.function.BiConsumer;

public class ExceptionLambda {

	public static void main(String[] args) {
		int someNumber =5;
		//Integer key = null;
		int key = 0 ;
		processNumber(someNumber, key, wraperLambda((k,v) -> System.out.println(k/v)));
	}
	
	public static void processNumber(int someNumber, int Key, BiConsumer<Integer, Integer> biConsumer){
		biConsumer.accept(someNumber,Key);
	}
	
	public static BiConsumer<Integer, Integer> wraperLambda(BiConsumer<Integer, Integer> biConsumer){
	 return (k,v) -> {
		 try{
			 biConsumer.accept(k, v);
			}catch(ArithmeticException x){
				System.out.println("AN Arithmatic exception");
			}
	 	
	 };
	}
}
