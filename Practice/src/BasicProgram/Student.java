package BasicProgram;

public class Student {
	private int id;
	private String name;
	private double grade;
	


	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void setGrade(double grade) {
		if(grade>=0 && grade<=100) {
		this.grade = grade;
		}
		else {
			System.out.println("Invalid Grade");
		}
	}
	public double getGrade() {
		return grade;
	}
	


   


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Tejas Pathare");
		s1.setGrade(101);
		s1.getGrade();
		System.out.println(s1);
		
	}

}
