/**
 * Student
 */
public class Student {

    private Name name;
    private int age;

    public Student(Name name, int age) {
        this.age = age;
        this.name = name;
    }
    public Name getname() {
        return this.name;
    }
    public int getage() {
        return this.age;
    }
    public String toString() {
        return "FirstName: "+ this.name.getfname() +" "+ "MiddleName: " + this.name.getmname() +" " + "LastName: " + this.name.getlname() + "\n" + "Age: " + this.age;
    } 
}