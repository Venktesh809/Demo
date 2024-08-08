package practices;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int count =0;
		int n2 = n;
		int sum =0; 
		
		while(n2 !=0) {
			count++;
			n2/=10;
		}
		
		int n3 = n;
		int rem =0; 
		while(n3 !=0) {
			rem = n3 % 10;
			int pwr = 1;
			for(int i=1 ; i<=count; i++) {
				pwr *= rem;
				
			}
			
			sum = sum + pwr;
			n3 /= 10;
			
		}
		
		if(sum == n) {
			System.out.println("ArmStrong");
		}
		else {
			System.out.println("Not ArmStrong");
		}

	}

}
