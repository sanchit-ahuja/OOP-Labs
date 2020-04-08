public class Anonymous {
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
    void hello() {
        
        HelloWorld englishGreeting = new HelloWorld() {
            String name = "Sam";
            public void greet() {
                System.out.println("HELLO");
            }
            public void greetSomeone(String someone) {
                System.out.println("Hello" + someone);
            }
        };
        englishGreeting.greet();
    }
    
    public static void main(String[] args) {
        Anonymous a1 = new Anonymous();
        a1.hello();
    }
}