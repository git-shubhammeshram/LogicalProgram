package DupStringCount;

import java.util.HashMap;
import java.util.Map;

public class Program5 {

	public static void main(String[] args) {

		String name = "Shubham Meshram";
		Map<Character, Integer> value = new HashMap();
		char ary[] = name.toCharArray();
		
		for(char keys:ary)
		{
			if(Character.isAlphabetic(keys))
			{
				if(value.containsKey(keys))
				{
					value.put(keys, value.get(keys)+1);
				}
				else 
				{
					value.put(keys, 1);
				}
			}
		}
		System.out.println(value);
		
	}

}
