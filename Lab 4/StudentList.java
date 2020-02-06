import java.io.IOException;
import java.util.Scanner;
/**
 * StudentList
 */
public class StudentList {

    public static Student[] list = new Student[2];
    public static int count = 0;

    public static void addStudent(Student std) {
            if(count>=20) {return;}
            list[count] = std;
            count++;
    }

    public static Student[] getStudentswithAge(int age) {
        Student[] ans = new Student[2];
        for(int i = 0; i<list.length; i++){
            if(list[i].getage() == age) {
                ans[i] = list[i];
            }
        }
        if(ans.length == 0) {
            return null;
        }
        return ans;
    }

    public static Student[] getStudentswithLastName(String lname) {
        Student[] ans_l = new Student[2];
        for(int i = 0; i<list.length; i++){
            if(list[i].getname().getlname() == lname) {
                ans_l[i] = list[i];
            }
        }
        if(ans_l.length == 0) {
            return null;
        }
        return ans_l;
    }

    public static Student[] getStudentsInRange(int minage,int maxage) {
        Student[] ans = new Student[2];
        for(int i = 0; i<list.length; i++){
            if(list[i].getage()>=minage && list[i].getage()<=maxage) {
                ans[i] = list[i];
            }
        }
        if(ans.length == 0) {
            return null;
        }
        return ans;
    }
}


class Test {
    public static Student readStudent() throws IOException{
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter a name comma separated or semicolon separated");
        String name1 = in1.nextLine();
        System.out.println("Enter age");
        int age1 = in1.nextInt();
        Name n1 = new Name(name1);
        Student s1 = new Student(n1,age1);
        return s1;
    }
    public static void main(String[] args) {
        for(int i = 0; i<2;i++) {
            try {
                Student temp = readStudent();
                StudentList.addStudent(temp);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println(e);
            }
        }
        Student [] ans1 = StudentList.getStudentswithAge(20);
        for(int i =0;i<ans1.length;i++) {
            System.out.println(ans1[i]);
        }
        //The next 2 are trivial and better to use a data structure like Vector or ArrayList
    }
}