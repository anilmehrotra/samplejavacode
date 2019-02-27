import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerTest {

	public static void main(String[] args) throws UnsupportedOperationException {

		List<Integer> returnList = new ArrayList<Integer>();

		Integer[] numbers = {6, 2, 4, 3, 2, 5}; //{ 6, 2, 4, 3, 2, 5 }, { 7,3,1,4,5 }
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
		//list = Arrays.asList(numbers);
		List<Integer> zero = Arrays.asList(Integer.valueOf(0));
		list.removeAll(zero);
		int orignialLength = list.size();
		
		Collections.sort(list);
		System.out.println("Input List : " +list);

		for (int i = 0; i < orignialLength; i++) {
			returnList.add(list.size());
			int minelement = list.get(0);
			for (int j = 0; j < list.size(); j++) {
				list.set(j, list.get(j) - minelement);
			}
			list.removeAll(zero);
			if (list.isEmpty())
				break;
		}
		
		System.out.println("Return List is : "+returnList);
	}
}
