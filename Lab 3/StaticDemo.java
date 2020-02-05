
public class StaticDemo {

	static int x = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStatic s1 = new MyStatic();
		s1.showData();
        MyStatic s2 = new MyStatic();
        s2.showData();
		MyStatic.b++;
		System.out.println(x +"Here");
		// s1.showData();
	}

}
