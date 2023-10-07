package RemoveDuplicate;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		String name;
		StringBuffer x = new StringBuffer();
		LinkedHashSet z = new LinkedHashSet();
		
		System.out.println("Enter the value");
		Scanner y = new Scanner(System.in);
		name = y.next();
		System.out.println("Result are");
		
		for(int i=0;i<name.length();i++)
		{
			z.add(name.charAt(i));
		}
		
		for(Object value:z)
		{
			x.append(value);
		}
		System.out.println(x);
		
		
		
		
		
		
		
		
	}

}
