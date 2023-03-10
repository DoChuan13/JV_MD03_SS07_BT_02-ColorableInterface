import shape.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square(20);
        shapes[3] = new Circle();
        shapes[4] = new Rectangle();
        shapes[5] = new Square(30);
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                Square square = (Square) shape;
                System.out.println(square);
                System.out.println("Colorable's Area: " + square.getArea());
                square.howToColor();
            }
        }
    }
}
