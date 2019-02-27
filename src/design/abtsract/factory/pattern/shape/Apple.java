package design.abtsract.factory.pattern.shape;

public class Apple implements Fruit{

    @Override
    public void getFruit() {
        System.out.println("Draw "+Apple.class.getSimpleName());
    }
}
