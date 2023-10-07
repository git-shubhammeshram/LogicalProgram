package DupStringCount;

import java.util.HashMap;
import java.util.Map;

public class Program3 {

	public static void main(String[] args) {

		String name = "Shubham";
		Map<Character, Integer> dupCharValues = new HashMap();
		char[] ary = name.toCharArray();
		
		for(char keys:ary)
		{
			if(Character.isAlphabetic(keys))
			{
				if(dupCharValues.containsKey(keys))
				{
					dupCharValues.put(keys, dupCharValues.get(keys)+1);
				}
				else
				{
				    dupCharValues.put(keys, 1)	;
				}
			}
		}
		System.out.println(dupCharValues);
	}

}
