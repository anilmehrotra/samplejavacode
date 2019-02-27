import java.util.HashMap;
import java.util.Set;

public class MyObjectKeySearch {
	
	String name;
	
	public MyObjectKeySearch(String name) {
		super();
		this.name = name;
	}

	public MyObjectKeySearch() {
		// TODO Auto-generated constructor stub
	}

	{
		System.out.println("FFFFFFFFFFFFFff");
	}
	static
	{
		System.out.println("staticmmmmmmmmmmmm");
	}
	public static void main(String a[]) {
		MyObjectKeySearch gg= new MyObjectKeySearch();
		MyObjectKeySearch ggd = new MyObjectKeySearch("");

		HashMap<Price, String> hm = new HashMap<Price, String>();
		Price p1 = new Price("Banana", 20);;
		Price p2 = new Price("Apple", 40);
		Price p3 = new Price("Orange", 30);
		hm.put(p1, "Banana");
		hm.put(p2, "Apple");
		hm.put(p3, "Orange");
		hm.put(p2, "Mango");
		/*printMap(hm);
		System.out.println("Does key available? " + hm.containsKey(p1));*/
	}

	public static void printMap(HashMap<Price, String> map) {

		Set<Price> keys = map.keySet();
		for (Price p : keys) {
			System.out.println(p + "==>" + map.get(p));
		}
	}
}
