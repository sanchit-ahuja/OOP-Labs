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
    void print() {
        System.out.println("ItemName "+ item.getitemName()+ "\n" + "itemIdNo "+ item.getitemidNo()+ "\n" + "itemQuantity "+ "\n" + item.getitemQuantity()+ "\n" + "ItemPrice "+ item.getitemPrice()+ "\n" + "Balance "+ balance);
    }
    void buyItem(Item item) {
        this.item = item;
        double totalCost = item.getitemPrice()*item.getitemQuantity();
        if(balance - totalCost >=0 && item.getitemQuantity()>0){
            balance -= totalCost;
            print();
        }
        else if (item.getitemQuantity()<=0){
            System.out.println("Invalid Order");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}