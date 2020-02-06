/**
 * Address
 */
import java.util.*; 
public class Address {

    private String line1;
    private char[] city;
    private char[] state;
    private String pin;
    public Address(String address) {
        StringTokenizer st1 = new StringTokenizer(address,"$");
        this.line1 = st1.nextToken();
        this.city = st1.;
        this.state = st1.nextToken();
        this.pin = st1.nextToken();
    }
}