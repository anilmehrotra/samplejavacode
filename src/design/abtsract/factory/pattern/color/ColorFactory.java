package design.abtsract.factory.pattern.color;

import design.abtsract.factory.pattern.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {
    
    @Override
    public Color getColor(String colorType) {
        if (colorType.equalsIgnoreCase("red"))
            return new Red();
        else if (colorType.equalsIgnoreCase("white"))
            return new White();
        else if (colorType.equalsIgnoreCase("green"))
            return new Green();
        return null;
    }

    @Override
    public Color create(String type) {
        if (type.equalsIgnoreCase("red"))
            return new Red();
        else if (type.equalsIgnoreCase("white"))
            return new White();
        else if (type.equalsIgnoreCase("green"))
            return new Green();
        return null;
    }
}
