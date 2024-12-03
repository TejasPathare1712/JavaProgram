package BasicProgram;
import java.util.Scanner;
public class PalindromeNumber {
	Scanner sc = new Scanner(System.in);
	public void palindrome() {
		System.out.println("Enter any number");
		int number = sc.nextInt();
		int rev=0;
		while(number!=0) {
			int digit = number%10;
			rev = (rev*10)+digit;
			number/=10;
		}
		System.out.println("Reverse Number  l"+rev);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber p1= new PalindromeNumber();
		p1.palindrome();
		

	}

}
