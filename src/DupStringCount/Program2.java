package DupStringCount;

import java.util.HashMap;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {
		String name = "Shubham";
		Map<Character, Integer> dupValues = new HashMap();
		char ary[] = name.toCharArray();
		
		for(char keys:ary)
		{
			if(Character.isAlphabetic(keys))
			{
				if(dupValues.containsKey(keys))
				{
					dupValues.put(keys, dupValues.get(keys)+1);
				}
				else
				{
					dupValues.put(keys, 1);
				}
			}
		}
		System.out.println("Value are as  = " +dupValues);

	}

}
