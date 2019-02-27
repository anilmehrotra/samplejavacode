import java.util.LinkedHashMap;
import java.util.Map;


public class OccurrenceCount {

	public static void main(String[] args) {
		String test  = "aaabbccacc";
		/*abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz
		abbbaacc
		hellowrold*/
		
		
		/********it will return the last of occurrence in case of tie************/		
		Character c = findMaxOChar(test);
		System.out.println(c);
		/********it will return the first of occurrence in case of tie***********/
		Character t = maximumOccurringCharacter(test);
		System.out.println(t);
		}
	
	public static  Character findMaxOChar(String text){
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
	    return mChar;
	}
	
	
	public static char maximumOccurringCharacter(String input) {
		char c = '\u0000';
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(char ch :input.toCharArray()){
			Integer temp = map.get(ch);
			if(temp != null){
				temp = temp+1;
				map.put(ch, temp);
			}else{
				map.put(ch,1);
			}
		}
		int temp1 = 0;
		for(Character ch1: map.keySet()){
			int temp2 = map.get(ch1);
			if(temp2>temp1){
				temp1 = temp2;
				c = ch1;
			}
 
		}
		return c;
	}
}

