package demo.api.spring.boot;

public interface Interface2 {
  default void show() {
    System.out.println("This is Interface2");
  }
}
