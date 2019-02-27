package stream.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		names.add("AAA");
		names.add("BBB");
		names.add("CCC");
		names.add("TCT");
		names.add("DDD");
		names.add("TTT");
		System.out.println("Name List : "+names);
		
		/***Traditional way to filter***/
		List<String> filterName = new ArrayList<String>();
		for(String name : names){
			if(name.startsWith("T")){
				filterName.add(name);
			}
		}
		System.out.println("Name List : "+filterName);
		
		List<String> filterName8 = names.stream()
										.filter(name -> name.startsWith("T"))
										.collect(Collectors.toList());
		/***Filter using Stream***/
		System.out.println("Name List : "+filterName8);
	}
}
