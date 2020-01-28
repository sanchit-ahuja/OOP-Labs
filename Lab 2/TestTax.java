/**
 * TestTax
 */
public class TestTax {

    public static void main(String[] args) {
        TaxOnSalary tax1 = new TaxOnSalary();
        TaxOnSalary tax2 = new TaxOnSalary(true);
        tax1.inputSalary();
        tax2.inputSalary();
        System.out.println("Tax for user 1 " + tax1.calculateTax());
        System.out.println("Tax for user 2 "+ tax2.calculateTax());
    }
}