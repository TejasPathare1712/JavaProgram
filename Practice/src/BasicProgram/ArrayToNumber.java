package BasicProgram;

public class ArrayToNumber {
	public void convertArrayToNumber() {
		int arr[]= {1,2,3,4,5};
		int num = 0;
		for(int i=0;i<arr.length;i++) {
			num=(num*10)+arr[i];
		}
		System.out.println("Number is = "+num);
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayToNumber a1 = new ArrayToNumber();
		a1.convertArrayToNumber();

	}

}
