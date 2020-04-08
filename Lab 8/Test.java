import java.util.*;
/**
 * Test
 */
abstract class Shape {
    final double PI = 3.14;
    double area;
    abstract void draw();
}
class Rectangle extends Shape {
    Rectangle(int l,int b) {
        area = l*b;
    }
    void draw() {
        System.out.println("Area of rect " + area);
    }

}

class Circle extends Shape {
    Circle(int r) {
        area = PI*r*r;
    }
    void draw() {
        System.out.println("Area of circle " + area);
    }
}

public class Test {

    public static void drawShapes(List<?extends Shape> lists) { //Wildcard 
        for(Shape s:lists) {
            s.draw();
        }        
    }
    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle(2,3));
        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle(4));
        list2.add(new Circle(12));
        drawShapes(list1);
        drawShapes(list2);

    }
}