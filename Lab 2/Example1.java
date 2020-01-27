/**
 * Example1
 */
import java.io.*;
public class Example1 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in); //Instantiate buffered reader class
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter name ");
        String name = br.readLine(); //Calling readline method which of type BufferedRead
        System.out.println("Your name "+ name);
    }
}