import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Frequency {

	public static void main(String[] args) {
		String text = "abbbccaa";
		String [] charArr = text.split("");
		
		List<String> list = Arrays.asList(charArr);
		Set<String> set = new LinkedHashSet<>(list);
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		System.out.println("list : "+ list);
		System.out.println("set : "+ set);
		
		for(String c : set)
			map.put(c,Collections.frequency(list,c));
		
		System.out.println(map);
		
		List<Map.Entry<String, Integer>> listMap = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(listMap,(o1,o2) -> o2.getValue().compareTo(o1.getValue()));
				
				/*new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});*/
		
		for(Map.Entry<String, Integer> mapTemp : listMap){
			//mapNew.put(mapTemp.getKey(),mapTemp.getValue());
			System.out.println(mapTemp.getKey()+" :: "+mapTemp.getValue());
			break;
		}
	}
}
