package demo.api.spring.boot;

public class TestDefaultInterface implements Interface1{
  
  /*public void show(){
    Interface1.super.show();
    Interface2.super.show();
  }*/
  
  @Override
  public void show(){
    System.out.println("estttt");
  }
  public static void main(String[] args) {

  }
}
