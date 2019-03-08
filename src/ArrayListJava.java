import java.util.ArrayList;
import java.util.List;


public class ArrayListJava{
  public static void main(String[] rr){
    List test = new ArrayList();
    test.add("AAA");
    test.add(123);
    System.out.println(test);
    final List test1 = new ArrayList();
    test1.add("fff");
    test1.add(123);
    System.out.println(test1);
    test1 = new ArrayList();//it will not work
    
  }
}