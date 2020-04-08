import java.util.*;
public class Stack {
    LinkedList<Integer> stack;
   private Stack() {
        stack = new LinkedList<Integer>(); 
    }
    public static Stack declarestack() {
        return new Stack();
    }
    public int length() {
        return stack.size();
    }
    public void addstack(int num) {
        stack.add(num);
    }
    public int front() {
        if(this.length()!=0){
        return stack.getLast();

        }
        return -1;
    }
    public void remove() {
        if(this.length()!=0) {
            stack.removeLast();
        }
        else {
            System.out.println("Stack empty");
        }
    }
    public static void main(String[] args) {
        Stack s1 = Stack.declarestack();
        s1.addstack(2);
        s1.addstack(3);
        s1.addstack(4);
        System.out.println(s1.front());
        s1.remove();
        System.out.println(s1.front());

    }
}