import java.util.Arrays;
import java.util.List;


public class TestArraysList {

	public static void main(String[] args) {
		String [] arr = {"aa","bb","cc"};
		List<String> list = Arrays.asList(arr);
		list.set(2, null);
		System.out.println(list);
		
		/****can't do add or delete operation coz asList is returing a List of fixed sise***/
		/*list.add("dd");
		list.remove(1);*/
	}
}
