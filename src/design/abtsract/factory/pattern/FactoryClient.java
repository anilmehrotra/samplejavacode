package design.abtsract.factory.pattern;

import design.abtsract.factory.pattern.color.Color;
import design.abtsract.factory.pattern.shape.Fruit;


public class FactoryClient {
    
    public static void main(String[] args) {
        
        System.out.println("General way !");
        FactoryProvider.getFactory("fruit").getFruit("apple").getFruit();
        FactoryProvider.getFactory("fruit").getFruit("mango").getFruit();
        FactoryProvider.getFactory("fruit").getFruit("mango").getFruit();
        FactoryProvider.getFactory("color").getColor("red").getColor();
        FactoryProvider.getFactory("color").getColor("white").getColor();
        FactoryProvider.getFactory("color").getColor("green").getColor();
        
        System.out.println("More generic way using generic interface type!\n");
        
        
        AbstractFactory<Fruit> fruitFactory = FactoryProvider.getFactory("fruit");
        fruitFactory.create("apple").getFruit();
        
        AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("color");
        colorFactory.create("red").getColor();
        
    }
}
