package RemoveDuplicate;

import java.util.LinkedHashSet;

public class Program2 {

	public static void main(String[] args) {

		String name = "Shuubbbbhaam";
		StringBuffer reName = new StringBuffer();
		LinkedHashSet revName = new LinkedHashSet();
		
		
		for(int i=0; i<name.length();i++)
		{
			revName.add(name.charAt(i));
		}
		System.out.println(revName);
		
		for(Object value:revName)
		{
			reName.append(value);
		}
		System.out.println(reName);
		
	}

}
