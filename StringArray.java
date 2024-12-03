class StringArray{
	public static void main(String args[]){
		System.out.println("-----Friends List-------");
		String friends[] =  {"Atharv","Virendra","Nagesh","Vishnu","Harshad","Bhagwat"};
		/*for(int i=0;i<=friends.length-1;i++){
			System.out.println(friends[i]);
		}*/
		System.out.println("Lengths of Friends = "+friends.length);
		for(String j:friends){
			System.out.println(j);
		}
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class Main{
    public static void Length(String arr[]){
        for(int i=0;i<10;i++){
            if(arr[i].length()==5){
                System.out.println(arr[i]);
            }
        }
    }
	public static void main(String args[]){
		System.out.println("-----Friends List-------");
		//String friends[] =  {"Atharv","Virendra","Nagesh","Vishnu","Harshad","Bhagwat"};
		/*for(int i=0;i<=friends.length-1;i++){
			System.out.println(friends[i]);
		}*/
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		for(int i=0;i<10;i++){
		    arr[i]=sc.nextLine();
		}
		System.out.println("No of friends whose length is 5");
		Main.Length(arr);
		//System.out.println("Lengths of Friends = "+friends.length);
		//for(String j:friends){
		//	System.out.println(j);
		//}
	}
}
