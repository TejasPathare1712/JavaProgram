package BasicProgram;

public class Employee {
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public void calculateBonus() {
		double bonus = 0.01*salary;
		System.out.println( "Bonus of Employee = "+bonus);
	}
}	

	 class Manager extends Employee{
		double bonus;

		public Manager(String name, double salary, double bonus) {
			super(name, salary);
			this.bonus = bonus;
		}

		@Override
		public void calculateBonus() {
			// TODO Auto-generated method stub
			double finalBonus = 0.02*salary + bonus;
			System.out.println("Bonus Of Manager = "+finalBonus);
		}
		
	 }
	 
	


	 

