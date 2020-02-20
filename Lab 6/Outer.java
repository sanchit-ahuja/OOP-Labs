/**
 * Outer
 */
public class Outer {

    private String s1 = "Outer String";
    void getString() {
        System.out.println(s1);
    }

    class Inner {
        private String s2 = "Inner String";
        void getString() {
            System.out.println(s2);
        }
        
    void getOuterString() {
        System.out.println(Outer.this.s1); //Getting the outer string variable
    }
    }
    Inner i1 = new Inner();
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.i1.getOuterString(); //One way to initialize Inner class inside the outer class
        Outer.Inner oi = o1.new Inner(); //First initialize the outer class then the inner class
        oi.getString();
    }
}