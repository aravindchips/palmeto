package test;
import java.util.Scanner;
public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur String");
		String str=sc.next();
		String str1="";
		int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		//System.out.println(str1);
		for(int i=0;i<str.length();i++) {
				if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')&&(str.equalsIgnoreCase(str1))){
					count++;
				}
		
		}
		if(count==2) {
			System.out.println("Palindrome");
		}
		
		
		else {
		}

	

}
}