
public class TestFibnacci {

	public static void main(String[] args) {
		
		Integer [] inputNumbers = {4,5};
		Integer [] outputNumbers = {9,14};
		boolean flag;
		int outputNo1 = inputNumbers[0]+inputNumbers[1];
		if(outputNo1 == outputNumbers[0]){
			System.out.println("1st if");
			int outputNo2 = outputNo1+inputNumbers[1];
			if(outputNo2 == outputNumbers[1]){
				flag = true;
				System.out.println("2nd if");
			}else{
				flag = false;
				System.out.println("2nd else");
			}
		}else{
			flag = false;
			System.out.println("1st else");
		}
		System.out.println(flag);
	}
}
