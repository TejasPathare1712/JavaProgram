package BasicProgram;

import java.util.Scanner;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value for 3 X 3 Matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
