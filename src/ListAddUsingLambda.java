import java.util.ArrayList;
import java.util.List;


public class ListAddUsingLambda {
    public static void main(String[] aa){
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);
        System.out.println(list.stream().filter(i->i>5).mapToInt(i->i).sum());
    }
}
