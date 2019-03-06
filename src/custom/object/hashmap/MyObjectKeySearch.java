package custom.object.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyObjectKeySearch {
	
	public static void main(String a[]){
	 HashMap<Price, String> hm = new HashMap<Price, String>();
	 Price fruitPrice = new Price("Banana", 20);
	 Price animalPrice = new Price("Dog", 40);
	 Price treePrice = new Price("Acacia", 30);
     hm.put(fruitPrice, "fruit");
     hm.put(animalPrice, "animal");
     hm.put(treePrice, "Tree");
     printMap(hm);
     //Price key = new Price("Banana", 20);
     System.out.println("Does Fruit key available? "+hm.containsKey(fruitPrice));
     fruitPrice.setItem("Apple");
     System.out.println("Does Fruit key available? "+hm.containsKey(fruitPrice));
 }
  
 public static void printMap(HashMap<Price, String> map){
      
     Set<Price> keys = map.keySet();
     for(Price p:keys){
         System.out.println(p+"==>"+map.get(p));
     }
 }
}
