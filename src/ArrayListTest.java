import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {
    public static void main(String[] args) {
        String[] str = new String[]{"ABC","CCC","DDD"};
        List<String> list = new ArrayList<String>();
        list.add("AAA");
        list.add("BBB");
        list.add("Hemant");
        System.out.println(list);
        for(String test  : list)
            System.out.println(test);
        for(String test : str)
            System.out.println(test);
    }
}
