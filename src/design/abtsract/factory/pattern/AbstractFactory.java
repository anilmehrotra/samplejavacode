package design.abtsract.factory.pattern;

import design.abtsract.factory.pattern.color.Color;
import design.abtsract.factory.pattern.shape.Fruit;

public interface AbstractFactory<T> {
    default Fruit getFruit(String fruitType){
        return null;
    }
    default Color getColor(String colorType){
        return null;
    }
    
    public T create(String type);
}
