/**
 * Name
 */
import java.util.*; 
public class Name {

    private String fname;
    private String lname;
    private String mname;

    public String getfname() {
        return this.fname;
    }
    public String getmname() {
        return this.mname;
    }
    public String getlname() {
        return this.lname;
    }
    public void setfname(String fname) {
        this.fname = fname;
    }
    public void setmname(String mname) {
        this.mname = mname;
    }
    public void setlname(String lname) {
        this.lname = lname;
    }

    

    public Name(String name) {
        StringTokenizer st1 = new StringTokenizer(name,",");
        StringTokenizer st2 = new StringTokenizer(name,";");
        if(st1.countTokens() == 1) {
            this.lname = st2.nextToken();
            this.mname = st2.nextToken();
            this.fname = st2.nextToken();
        }
        else {
            this.fname = st1.nextToken();
            this.mname = st1.nextToken();
            this.lname = st1.nextToken();
        }
    }

}