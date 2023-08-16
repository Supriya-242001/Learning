package logicalOperator;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("In input valid(true/false): ");
		boolean a=scan.nextBoolean();
		System.out.println("Does input meet a certain condition(true/false): ");
		boolean b=scan.nextBoolean();
		boolean c=isValidInput(a,b);
		if(c==true) {
			System.out.println("Input is valid");
		}
		else {
			System.out.println("Input is not valid");
		}
		
		
	}
	public static boolean isValidInput(boolean a,boolean b) {
		return a&&b;
	}
}
