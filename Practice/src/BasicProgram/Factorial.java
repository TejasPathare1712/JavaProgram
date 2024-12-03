package BasicProgram;

import java.util.Scanner;

public class Factorial {
	public void calculateFactorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+" = "+fact);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f1 = new Factorial();
		f1.calculateFactorial();

	}

}
