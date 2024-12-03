package BasicProgram;


public class PrimeNumber {
	public void prime(int no) {
		int count=0;
		for(int i=2;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
			
		
		}
		if(count==2) {
			System.out.println(no);
	}
	}

	public static void main(String[] args) {
        PrimeNumber p1 = new PrimeNumber();
        for(int no=2;no<=100;no++) {
        	p1.prime(no);
        }
	}

}
