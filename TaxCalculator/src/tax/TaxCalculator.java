package tax;

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		double pa=scan.nextDouble();
		System.out.println("Enter the tax rate");
		double tax=scan.nextDouble();
		System.out.println("Total cost including Tax" +calculateTotalWithTax(pa,tax)+"");
		
	}
 public static double calculateTotalWithTax(double pa, double tax) {
	 return (pa*tax)+pa;
 }
}
