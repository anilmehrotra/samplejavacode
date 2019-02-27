package design.factory.pattern;

public class TestFactory {
    
    public static void main(String[] args) {
        Factory.getFruit("apple").draw();
        Factory.getFruit("Mango").draw();
        Factory.getFruit("Orrange").draw();
    }
}
