package finctional.intreface.test;

@FunctionalInterface
public interface TestInterface {
    public void show();
    default void show(String name){
        System.out.println("Tsting");
    }
    default void show1(String name){
        System.out.println("Tsting1");
    }
}
