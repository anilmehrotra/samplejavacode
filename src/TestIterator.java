import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestIterator {

	public static void main(String[] args) {
		
		int count  = 0 ;
		
		List<String> list = new ArrayList<>();
		list.add("test");
		list.add("best");
		list.add("tech");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			count++;
			System.out.println("calling times : "+count);
			String t = itr.next();
			System.out.println(t);
			
			//list.add(t);
			list.remove(t);
			
			/*if(t.equals("best"))
			itr.remove();*/
		}
		//System.out.println(list);
	}
}
