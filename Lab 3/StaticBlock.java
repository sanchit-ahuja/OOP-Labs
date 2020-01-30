/**
 * StaticBlock
 */
public class StaticBlock {
    static int values[] = initializeArray(5);
    private static int[] initializeArray(int N) {
        int[] arr = new int[N];
        for (int i = 0; i <arr.length; i++) {
        arr [i] = i;
         }
         return arr;
         }
     void listValues() {
         for(int value:values) {
             System.out.println(value);
         }
     }    
    
    public static void main(String[] args) {
      StaticBlock ex = new StaticBlock();
      System.out.println("First object \n");
      ex.listValues();
      StaticBlock ex2 = new StaticBlock();
      System.out.println("Second object \n");
      ex2.listValues();  
    }
}