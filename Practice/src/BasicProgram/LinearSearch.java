package BasicProgram;

import java.util.Scanner;

public class LinearSearch {
	int arr[] = new int[10];
	Scanner sc = new Scanner(System.in);
	
	public void searchArray() {
		//int arr[] = new int[10];
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Numbers");
		
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Given Arrays are");
		for(int i=0;i<10;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	public void  searchElement() {
		System.out.println("Search Element to search");
		boolean b = false;
		int number = sc.nextInt();
		for(int i=0;i<10;i++) {
			if (arr[i]==number) {
			   System.out.println("Element is  found at index"+(i+1));
			   b=true;
			   break;
			   
			}
			
			
			
		}if(b==false) {
			System.out.println("Element is not found");
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch l1 = new LinearSearch();
		l1.searchArray();
		l1.searchElement();
		

	}

}
