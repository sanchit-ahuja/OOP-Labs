/**
 * TextApp
 */
import java.util.*;

// import sun.util.locale.StringTokenIterator; 

public class TextApp {

    private String s = "";
    private String[] split;
    private String[] labels;
    private String[] count;
    TextApp(String s) {
        this.s = s;
    }
    public String[] Split() {
        StringTokenizer st1 = new StringTokenizer(s,"#");
        List<String> temp = new ArrayList<String>();
        // System.out.println(st1.countTokens());
        while(st1.hasMoreTokens()){
            String temp_string = st1.nextToken();
            // System.out.println(temp_string+"TEMP");
            String[] words = temp_string.split("\\s");
            for(String w:words) {
                temp.add(w);
            }
        }
       String ans [] = temp.stream().toArray(String[]::new);
       split = ans;
    //    ans = temp.toArray();
       return ans;

    }


    public static void main(String[] args) {
        TextApp t1 = new TextApp("abc def#def ghi#abc def#ABC def");
        // String str = "1234";
        // int num = str.charAt(0) - '0';
        // int num = Integer.parseInt(str.charAt(0));
        // System.out.println(num);
        // System.out.println(Arrays.toString((t1.Split())));
        String [] labels = t1.UniqueLabels(t1.Split());
        System.out.println(Arrays.toString(t1.Count(t1.Split(),labels)));
    }
    public String[] UniqueLabels(String words[]) {
        List<String> temp = new ArrayList<String>();
        for(int i=0;i<words.length;i++) {
            if(!temp.contains(words[i]) && !temp.contains(words[i].toLowerCase()))
            {
                temp.add(words[i]);
            }
        }
       String ans [] = temp.stream().toArray(String[]::new);
       labels = ans; 
       return ans;
    }

    public String [] Count(String[] words, String[] labels) {
        List<String> temp = new ArrayList<String>();
        for(int i = 0;i<labels.length;i++){
            int cnt = 0;
            for(int j=0;j<words.length;j++){
                // System.out.println(words[j].toLowerCase() == labels[i]);
                if(words[j].toLowerCase().equals(labels[i])) { // == Checks reference equality!! Remember use .equals method for it
                    // System.out.println("Work");
                    cnt+=1;
                }
            }
            temp.add(labels[i]+" " + Integer.toString(cnt));
        }
        String ans [] = temp.stream().toArray(String[]::new);
        count = ans;
        return ans;
    }
    void display(int n) {
        // String str1 = ""
        // int x = 
    }

}

