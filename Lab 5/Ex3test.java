
class A {
    public int a = 100;
    public void print_a() {
        System.out.println("A: "+ a);
    }
    int fun(int x) {
        return x*2;
    }
}

class B extends A {
    public int a  = 80;
    public void print_b() {
        System.out.println("B: "+ a);
    }
    int fun(int x) {
        return x*3;
    }
}

class C extends B {
    public int a = 60;
    public void print_c() {
        System.out.println("C: "+ a);
    }
    int fun(int x){
        return x*4;
    }
}

class D extends C {
    public int a = 40;
    public void print_d() {
        System.out.println("D: "+ a);
    }
    int fun(int x) {
        return x*5;
    }
}

class E extends D {
    public int a = 10;
    public void show() {
        print_a();
        // print_b();
        print_c();
        print_d(); 
        
    }
    // int fun(int x) {
    //     return x*6;
    // }
}
class Main1 {
    public static void main(String[] args) {
        // E e = new E();
        // e.show();
        // B a1 = new E(); //If there's no a in class B, the reference will try to access the a of parent class of B i.e. A.
        // System.out.println(a1.a);
        A a1 = new E(); //Since there's no fun(x) method to override in class E, the reference overrides the fun method of the inherited class D in E.
        D d1 = (D) a1; //Problematic since we're typecasting a child object to a parent object although it compiles.
        // System.out.println(a1.fun(4));
    }
}