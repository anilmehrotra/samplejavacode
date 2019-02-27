package design.abtsract.factory.pattern.shape;

import design.abtsract.factory.pattern.AbstractFactory;

public class FruitFactory implements AbstractFactory<Fruit> {
    
    @Override
    public Fruit getFruit(String fruitType){
        if (fruitType.equalsIgnoreCase("apple"))
            return new Apple();
        else if (fruitType.equalsIgnoreCase("mango"))
            return new Mango();
        else if (fruitType.equalsIgnoreCase("orrange"))
            return new Orrange();
        return null;
    }

    @Override
    public Fruit create(String type) {
        if (type.equalsIgnoreCase("apple"))
            return new Apple();
        else if (type.equalsIgnoreCase("mango"))
            return new Mango();
        else if (type.equalsIgnoreCase("orrange"))
            return new Orrange();
        return null;
    }
}
