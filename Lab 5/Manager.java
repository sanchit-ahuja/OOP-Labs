/**
 * Manager
 */
public class Manager extends Employee {

    private String dept = "";
    Manager(String name,double salary,String dept) {
        super(name, salary);
        this.dept = dept;
    }
    public void setdept(String dept) {
        this.dept = dept;
    }
    public String getdept() {
        return this.dept;
    }

    @Override
    public String toString() {
        return "Name: " + getname() + " "+  "Salary: " + getsalary() + "Dept: " + this.dept;
    }
    
}

