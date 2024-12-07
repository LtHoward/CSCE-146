//Written by Myila Howard 
import java.util.Scanner;
public class Helper {
	static void forLoop(int s)
	{
		double[] array = new double[s];
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < s; i++) 
		{
			System.out.println("Enter a number:");
			array[i] = keyboard.nextDouble();
		}
		double sum = 0;
		for(double num : array) 
		{
			sum += num;
		}
		System.out.println("Sum of values in the array: "+ sum);
	}
	static void whileLoop() 
	{
		double sum = 0;
		Scanner keyboard = new Scanner(System.in);
		
		double num;
		do 
		{
			System.out.println("Enter a number (type 0 to stop) : ");
			num = keyboard.nextDouble();
			sum += num;
		}while(num !=0);
		System.out.println("Sum of values entered: " + sum);
	}
	static void ifStatements(double x, double y) 
	{
		if( x > y) 
		{
			System.out.println("X is greater than Y");
		}
		else if(x == y) 
		{
			System.out.println("X is equal to Y");
		}
		else 
		{
			System.out.println("X is less than Y");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Helper.forLoop(3);
		Helper.whileLoop();
		
		System.out.println("Enter a value for X: ");
		double xValue = keyboard.nextDouble();
		
		System.out.println("Enter a value for Y: ");
		double yValue = keyboard.nextDouble();
		
		Helper.ifStatements(xValue, yValue);
	}

}
