package test;
import java.util.Scanner;
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur number");
		int n=sc.nextInt();
		int rev=0;
		int collect=0;
		while(n>0) {
			int rem=n%10;
			if(rem==0)
				collect=rem;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);

	}

}
