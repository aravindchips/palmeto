package test;
import java.util.Scanner;
public class PowerOfIndexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur number");
		int ar[]=new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++) {
			ar[i]=(ar[i]+ar[i]*i);
			sum=sum+ar[i];
		}
		for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);

	}

}
