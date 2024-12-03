package BasicProgram;

public class Dog {
	String name;
	String color;
	

	public Dog(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	


	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("Pet Bull","Black");
		System.out.println(d1);

	}

}
