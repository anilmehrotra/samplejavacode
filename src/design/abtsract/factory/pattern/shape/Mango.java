package design.abtsract.factory.pattern.shape;

public class Mango implements Fruit {

    @Override
    public void getFruit() {
        System.out.println("Draw "+Mango.class.getSimpleName());        
    }
}
