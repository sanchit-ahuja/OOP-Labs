/**
 * ComplexDemo
 */
public class ComplexDemo {

    public static void main(String[] args) {
        Complex c1 = new Complex(2.0,3.0);
        Complex c2 = new Complex(4,5);
        System.out.println("Add: " + c1.add(c2));
        System.out.println("Subtract: "+ c1.subtract(c2));
        System.out.println("Multiply: " + c1.multiply(c2));
        System.out.println("Divide: " + c1.divide(c2));
    }
}