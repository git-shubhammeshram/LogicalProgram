package ScannerClass;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		int num;
		int num2;
		
		System.out.println("Enter the value");
		Scanner x = new Scanner(System.in);
		num = x.nextInt();
		num2 = x.nextInt();
		
		if(num>num2)
		{
			System.out.println("The value is pass");
		}
		else
		{
			System.out.println("The value is fail");
		}
		
		
	}

}
