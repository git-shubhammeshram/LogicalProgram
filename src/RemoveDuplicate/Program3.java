package RemoveDuplicate;

import java.util.LinkedHashSet;

public class Program3 {

	public static void main(String[] args) {

		String name = "shuuuubbhhhhaammmm";
		StringBuffer revName = new StringBuffer();
		LinkedHashSet x = new LinkedHashSet();
		
		for(int i=0;i<name.length();i++)
		{
			x.add(name.charAt(i));
		}
		
		for(Object value:x)
		{
			revName.append(value);
		}
		System.out.println(revName);
		
		
		
	}

}
