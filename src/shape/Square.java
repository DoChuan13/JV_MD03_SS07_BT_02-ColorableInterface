package shape;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getArea() {
        return Math.pow(this.getSide(), 2);
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square width side = " +
                getSide() +
                ", which is a subclass of " +
                super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides!!!");
    }
}
