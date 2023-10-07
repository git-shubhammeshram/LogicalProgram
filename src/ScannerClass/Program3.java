package ScannerClass;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		System.out.println("Enter the value");
		Scanner x = new Scanner(System.in);
		num1 = x.nextInt();
		num2 = x.nextInt();
		if(num1<num2)
		{
		System.out.println((num1+num2));
		System.out.println((num1*num2));
		System.out.println((num1/num2));
		System.out.println((num1-num2));
		}

	}

}
