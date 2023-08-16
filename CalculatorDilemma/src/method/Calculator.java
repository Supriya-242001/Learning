package method;
import java.util.Scanner;
public class Calculator {
			public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter 2 numbers for arithmetic operation");
				int a=scan.nextInt();
				int b=scan.nextInt();
				System.out.println("Enter the operation");
				char ch=scan.next().charAt(0);
				System.out.println(arithmeticOperation(a,b,ch));
			}
			public static int arithmeticOperation(int x,int y,char ch) {
				switch(ch) {
				case '+':
					return x+y;
				case '-':
					return x-y;
				case '*':
					return x*y;
				case '/':
					return x/y;
				default:
					System.out.println("Inavalid operation");
				}
				return 0;
			}
					
				


}
