/**
 * TestStore
 */
public class TestStore {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setname("Sanchit");
        c1.setidNo(1);
        Item i1 = new Item();
        Item i2 = new Item();
        i1.setitemName("apple");
        i1.setitemPrice(100);
        i1.setitemQuantity(10);
        i1.setitemidNo(1);

        i2.setitemName("guava");
        i2.setitemPrice(200);
        i2.setitemQuantity(10);
        i2.setitemidNo(2);
        c1.buyItem(i1);
        
    }
}