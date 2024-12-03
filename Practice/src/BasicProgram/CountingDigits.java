package BasicProgram;

import java.util.Scanner;

public class CountingDigits {
	public void countDigit() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number ");
		int number = sc.nextInt();
		while(number>0) {
			number/=10; //5647
			count++;
			
		}
		System.out.println("Digits in given Number = "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingDigits c1 = new CountingDigits();
		c1.countDigit();

	}

}
