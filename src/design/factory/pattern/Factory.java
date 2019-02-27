package design.factory.pattern;

public class Factory {
    public static Fruit getFruit(String shape){
        if(shape.equalsIgnoreCase("apple"))
            return new Apple();
        else if(shape.equalsIgnoreCase("mango"))
            return new Mango();
        else if(shape.equalsIgnoreCase("Orrange"))
            return new Orrange();
            
       return null;
    }
}
