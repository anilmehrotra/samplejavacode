package design.abtsract.factory.pattern.shape;

public class Orrange implements Fruit {

    @Override
    public void getFruit() {
        System.out.println("Draw "+Orrange.class.getSimpleName());        
    }
}
