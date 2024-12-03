package BasicProgram;
/* //write a program to print following pattern 
5
45
345
2345
12345
 

 * */
public class Pattern {
     public void pattern1() {
    	 for(int i=5;i>=1;i--) {
    		for(int j=i;j<=5;j++) {
    			System.out.print(j);
    		}
    		System.out.println();
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p1 = new Pattern();
		p1.pattern1();
	}

}
