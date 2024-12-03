package BasicProgram;

public class NumberToArray {
	public void convertNumberToArray() {
		int number = 25648;
		while(number>0) {
		number%=10;
		System.out.println("{"+number+","+"}");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberToArray a1 = new NumberToArray();
		a1.convertNumberToArray();

	}

}
