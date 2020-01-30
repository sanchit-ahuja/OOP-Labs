
public class MyStatic {

	int a = 0;
	static int b;
	public MyStatic() {
		b++;
		// TODO Auto-generated constructor stub
	}
	public void showData() {
		System.out.println("Value of a " + a);
		System.out.println("Value of b " + b);
	}
	public void increment() {
		a++;
	}

}
