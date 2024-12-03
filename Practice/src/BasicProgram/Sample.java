package BasicProgram;
// 13/11/2024
public class Sample {
	int no;
	static int amt;
	public static void show() {
		System.out.println("Inside static method");
		System.out.println(amt);
	}
	public void greet() {
		System.out.println("Good Morning");
	}
	// static block
	static {
		System.out.println("I am inside static block");
	}
	// non static block
	{
		System.out.println("I am inside non static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample.show();
		Sample s1 = new Sample();
		s1.greet();
		

	}

}
