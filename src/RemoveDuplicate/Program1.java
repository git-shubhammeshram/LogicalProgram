package RemoveDuplicate;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {

		String name = "Shubhammmmmaaaaabbbhhh";
		StringBuffer x = new StringBuffer();
		
//		TreeSet z = new TreeSet();
//		HashSet z = new HashSet();
		LinkedHashSet z = new LinkedHashSet();
		
		
		for(int i=0; i<name.length();i++)
		{
			z.add(name.charAt(i));
		}
		System.out.println(z);
		
		for(Object value:z)
		{
			x.append(value);
		}
		System.out.println(x);
	}

}
