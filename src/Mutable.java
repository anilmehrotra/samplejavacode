

public class Mutable extends Immutable {

  private int realValue;

  public Mutable(int value) {
    super(value);
    realValue = value;
  }

  public int getValue() {
    System.out.println("method of Mutable");
    return realValue;
  }

  public void setValue(int newValue) {
    realValue = newValue;
  }

  public static void main(String[] arg) {
    Mutable obj = new Mutable(4);
    Immutable immObj =  obj;
    if (immObj instanceof Immutable) {
      System.out.println("1");
    }else{
      System.out.println("2");
    }
    System.out.println(immObj.getValue());
    obj.setValue(8);
    System.out.println(immObj.getValue());
  }

}
