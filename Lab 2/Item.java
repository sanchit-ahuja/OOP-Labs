/**
 * Item
 */
public class Item {

   private String itemName;
   private int itemidNo;
   private int itemQuantity = 1;
   private double itemPrice = 500;

   public String getitemName() {
       return itemName;
   }
   public void setitemName(String itemname) {
       this.itemName = itemname;
   }
   public int getitemidNo() {
       return itemidNo;
   }
   public void setitemidNo(int itemidno){
       this.itemidNo = itemidno;
   }

   public int getitemQuantity() {
       return itemQuantity;
   }
   public void setitemQuantity(int itemquantity) {
       this.itemQuantity = itemquantity;
   }

   public double getitemPrice() {
       return itemPrice;
   }
   
   public void setitemPrice(double itemprice) {
       this.itemPrice = itemprice;
   }


   
}