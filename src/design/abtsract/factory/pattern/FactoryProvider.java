package design.abtsract.factory.pattern;

import design.abtsract.factory.pattern.color.ColorFactory;
import design.abtsract.factory.pattern.shape.FruitFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("fruit"))
            return new FruitFactory();
        else if(choice.equalsIgnoreCase("color"))
            return new ColorFactory();
        return null;
    }
}
