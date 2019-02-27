package unmodifiable.list;

import java.util.ArrayList;
import java.util.List;

public class ClientRunner {
    
    public static void main(String[] args) {
        List<String> listofString = new ArrayList<String>();
        listofString.add("AAA");
        listofString.add("BBB");
        listofString.add("AAA");
        listofString.add("CCC");
        List<String> unmodifiable = ListUttility.getUnmodifiableList(listofString);
        System.out.println(unmodifiable);
        /*System.out.println(unmodifiable.get(2));
        System.out.println(unmodifiable.size());*/
        unmodifiable.add("DDD");
        System.out.println(unmodifiable);
        
        System.out.println("**********Person List*********");
        List<Person> listofPerson = new ArrayList<Person>();
        listofPerson.add(new Person("ABC", "Delhi"));
        listofPerson.add(new Person("DEF", "BLR"));
        listofPerson.add(new Person("XYZ", "Delhi"));
        listofPerson.add(new Person("ABC", "Delhi"));
        System.out.println(listofPerson);
        listofPerson.add(new Person("Test1", "Delhi"));
        System.out.println(listofPerson);
    }
}
