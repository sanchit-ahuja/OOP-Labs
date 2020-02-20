/**
 * StaticOuter
 */
public class StaticOuter {

    String outer = "Outer String";
    static String outerb = "Static outer string";

    static class Inner {
        String nonstatic = "Non Static Inner string";
        static String inner = "Static inner string";
    }
    void seeStaticInner() {
        // System.out.println(Inner.nonstatic); Cannot make a static reference to a non static variable
        System.out.println(Inner.inner);
        // System.out.println(new Inner().nonstatic);
        Inner x = new Inner(); //It is possible to access a non static variable by instantiating a class to access that variable
        System.out.println(x.nonstatic + "g");
    }
    // public static void main(String[] args) {
    //     StaticOuter o1 = new StaticOuter();
    //     // o1.seeStaticInner();
    //     System.out.println(Inner.inner); //Cam even be accessed without instantiating outer class
    // }
}

class Other {
    public static void main(String[] args) {
        System.out.println(StaticOuter.Inner.inner);
        StaticOuter.Inner in = new StaticOuter.Inner();
        // StaticOuter.Inner in = this; No this exists in static context
        System.out.println(in.nonstatic);
        System.out.println(in.inner);
    }
}