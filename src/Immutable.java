package demo.api.spring.boot;

public class Immutable {
  private final int value;

  private Immutable(int value) {
    this.value = value;
  }

  public int getValue() {
    System.out.println("method of immutable");
    return value;
  }
}
