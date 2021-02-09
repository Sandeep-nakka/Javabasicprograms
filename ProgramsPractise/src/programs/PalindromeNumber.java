package programs;

import java.util.Scanner;

public class PalindromeNumber {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int newnumber=0;
		while(number>0) {
			
			int rem=number%10;
			newnumber=newnumber*10+rem;
			number=number/10;
			
			
		}
		
		System.out.print(newnumber);
	}

}
