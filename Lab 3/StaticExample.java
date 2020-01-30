/**
 * StaticExample
 */

/**
 * Static blocks initialized first. Any number of static blocks.
 * executable statements executed by JVM when class loaded
 * if static var/methods referred, theres statements
 * executed after the class loaded into JVM
 */
public class StaticExample {

    static {
        System.out.println("First static block");

    }
    public StaticExample() {
        System.out.println("Constructor called");
    }
    public static String staticString = "Static String var";

    static {
        System.out.println("Second static block " + staticString);
    }
    public static void main(String[] args) {
        StaticExample s = new StaticExample(); //Static blocks would only be called once 
        StaticExample.staticMethod2(); // This just calls the staticMethod2 if all the other blocks haven't been called
        
    }
    static {
        staticMethod();
        System.out.println("Third block");

    }  
    public static void staticMethod() {
        System.out.println("Static method");
    }
    public static void staticMethod2() {
        System.out.println("Static method2");
    }

}