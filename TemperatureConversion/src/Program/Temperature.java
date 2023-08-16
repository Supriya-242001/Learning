package Program;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1.convert celsius to fahrenheit");
		System.out.println("2.convert fahrenheit to celsius");
		System.err.println("Select one of two conversion");
		int num=scan.nextInt();
		switch (num)
		{
		case 1:
			System.out.println("Enter the temperature in celsius");
			double c= scan.nextDouble();
			System.out.println(CelsiusToFahrenheit(c));
		case 2:
			System.out.println("Enter the temperature in fahrenheit");
			double f= scan.nextDouble();
			System.out.println(FahrenheitToCelsius(f));
		}
		
	}
	public static double CelsiusToFahrenheit(double c)
	{
		double d=(double)(c*9/5)+32;
		return d;
	}
	public static double FahrenheitToCelsius(double f)
	{
		double g=(double)(f-32)*5/9;
		return g;
	}


}
