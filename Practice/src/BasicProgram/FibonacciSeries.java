package BasicProgram;

import java.util.Scanner;

public class FibonacciSeries {
	// 0 1 1 2 3 5 8 13 ..
	public void Fib() {
		int a = 0;
		int b = 1;
		int n;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n");
		n=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries f1 = new FibonacciSeries();
		f1.Fib();

	}

}
