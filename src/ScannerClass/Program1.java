package ScannerClass;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		int num;
		int num2;
		System.out.println("Enter the value");
		Scanner x = new Scanner(System.in);
		num = x.nextInt();
		num2 = x.nextInt();
		
		System.out.println("Addition is = " + (num + num2));
		
	}

}
