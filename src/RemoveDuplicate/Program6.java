package RemoveDuplicate;

import java.util.LinkedHashSet;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shubhammmmmmaaaaassssssbbbbbhhhhh";
		StringBuffer x = new StringBuffer();
		LinkedHashSet z = new LinkedHashSet();
		
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
