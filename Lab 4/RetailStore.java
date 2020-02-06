/**
 * RetailStore
 */
public class RetailStore {

    private int[] itemId = {1,2,3,4,5};
    private double[] price = {101.1,103.3,3213.4,323};
    private double calc(int val) {
        for(int i = 0; i<price.length;i++) {
            if(itemId[i] == val) {
                return price[i]; 
            }
        }
        return price[val];
    }
    public static void main(String[] args) {
        RetailStore r = new RetailStore();
        System.out.println(r.calc(10)); //There's no Compilation error but a runtime error
    }
}