/**
 * Customer
 */
public class Customer {
    private String name;
    private int idNo;
    private double balance = 5000;
    private Item item;
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    
    public int getidNo() {
        return idNo;
    }
    public void setidNo(int idNo){
        this.idNo = idNo;
    }
    public double getbalance() {
        return balance;
    }
    // public void setbalance(double balance) {
    //     this.balance = balance;
    // }
    void print() {
        System.out.println("ItemName "+ item.getitemName() + "itemIdNo "+ item.getitemidNo() + "itemQuantity " + item.getitemQuantity() + "ItemPrice "+ item.getitemPrice() + "Balance "+ balance);
    }
    
}