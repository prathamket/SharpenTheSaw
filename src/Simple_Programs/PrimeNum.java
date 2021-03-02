package Simple_Programs;

public class PrimeNum {
	public static void main(String[] args) {

		System.out.println("Checking prime numbers betweent 1 to n ");
		int temp = 0;
		
		for(int i=1; i<=100;i++) {
			
			for(int j=2;j<=i-1; j++) {
				
				if(i%j==0) {
					temp = temp+1;
				}
			}
			if(temp==0) {
				System.out.println(i+" is prime number");
			}else {
				temp=0;	
			}
			
		}
		
	}
}
