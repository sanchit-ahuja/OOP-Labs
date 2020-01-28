/**
 * TaxOnSalary
 */
import java.util.*;
public class TaxOnSalary {

    private double salary;
    private boolean PANsubmitted;
    
    TaxOnSalary () {
        this.salary = 0.0;
        this.PANsubmitted = false;
    }

    TaxOnSalary(double salary, boolean PANsubmitted) {
        this.salary = salary;
        this.PANsubmitted = PANsubmitted;
    }

    TaxOnSalary(boolean PANsubmitted) {
        this.salary = 1000.00;
        this.PANsubmitted = PANsubmitted;
    }
    public double getSalary() {
        return salary;
    }
    public boolean getPANsubmitted() {
        return PANsubmitted;
    }
    public double calculateTax() {
        double tax;
        if(salary<180000 && PANsubmitted){
            tax = 0;
        }
        else if(salary<180000 && !PANsubmitted) {
            tax = 0.05*salary;
        }
        else if(salary>500000 && salary<1000000) {
            tax = 0.2*salary;
        }
        else {
            tax = 0.3*salary;
        }
        return tax;
    }
    public void inputSalary() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your salary ");
        this.salary = in.nextDouble();
    }
}