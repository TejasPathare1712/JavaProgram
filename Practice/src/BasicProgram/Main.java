package BasicProgram;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Tejas",5000);
		e1.calculateBonus();
		Manager m1 = new Manager("Vinit",10000,1000);
		m1.calculateBonus();

	}

}
