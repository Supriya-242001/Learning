package bitwise;

import java.util.Scanner;

public class BitwiseSwapper {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int a=scan.nextInt();
		System.out.println("Enter the second integer:");
		int b=scan.nextInt();
		
		swapUsingBitwise(a,b);
	}
	public static void swapUsingBitwise(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:First="+a+",Second="+b+"");
		
	}

}
