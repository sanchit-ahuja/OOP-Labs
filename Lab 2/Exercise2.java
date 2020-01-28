/**
 * Exercise2
 */
import java.util.*;
public class Exercise2 {

   public static void main(String[] args) {
        char s;
        Scanner in = new Scanner(System.in); //instantiate Scanner constructor by passing System.in
        System.out.println("Enter a char");
        s = in.next().charAt(0);
        System.out.println("Ascii val "+(int)s);


   } 
}