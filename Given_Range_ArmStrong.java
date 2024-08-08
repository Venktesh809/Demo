package practices;

import java.util.Scanner;

public class Given_Range_ArmStrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting Range");
		int m = sc.nextInt();
		System.out.println("Ending Range");
		int n = sc.nextInt();
		
		int cunt_ArmStrong = 0;
				
		for(int i= m; i<=n; i++) {
			
			int count =0;
			int n2 = i;
			int sum =0; 
			
			while(n2 !=0) {
				count++;
				n2/=10;
			}
			
			int n3 = i;
			int rem =0; 
			while(n3 !=0) {
				rem = n3 % 10;
				int pwr = 1;
				for(int j=1 ; j<=count; j++) {
					pwr *= rem;
					
				}
				
				sum = sum + pwr;
				n3 /= 10;
				
			}
			
			if(sum == i) {
				cunt_ArmStrong++;			// count the no of armStrong
				
				System.out.println("ArmStrong  " +sum);
			}

		}
		System.out.println("no of ArmStrong " +cunt_ArmStrong);

	}

}
