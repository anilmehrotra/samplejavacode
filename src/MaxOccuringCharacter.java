

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxOccuringCharacter {

	public static void main(String[] args) {
	    String text =  "aabbccac";
	    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        Character mChar = ' '; 
        long max = Integer.MIN_VALUE;
        for(int i=0;i<text.length();i++){
            Character current = text.charAt(i);
            if(map.containsKey(current)){
                map.put(current,map.get(current)+1);
            }
            else{
                map.put(current,1);
            }
            if(map.get(current)>=max){
                mChar = current;
                max = map.get(current);
            }
        }
        
        System.out.println(mChar+":"+map.get(mChar));
	}
}
 