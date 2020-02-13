/**
 * Employee
 */
public class Employee {

    private String name = "";
    private double salary = 0;
    Employee(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setsalary(double salary) {
        this.salary = salary;
    }
    public String getname() {
        return this.name;
    }
    public double getsalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " " + "Salary: " + this.salary;
    }
}