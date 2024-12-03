package BasicProgram;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculator Operations");
		Calculator c1 = new Calculator();
		c1.add(10, 20);
		c1.add(10, 20, 30);
		c1.add(10.5f, 20.5f);
		System.out.println("Advanced Calculator operations");
		AdvancedCalculator c2 = new AdvancedCalculator();
		c2.add(20, 50);
		c2.add(50, 60, 70);
		c2.add(55.5f, 30.5f);
		
		

	}

}


