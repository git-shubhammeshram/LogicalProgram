package DupStringCount;

import java.util.HashMap;
import java.util.Map;

public class Program4 {

	public static void main(String[] args) {

		String name = "Shubham Meshram";
		Map<Character, Integer> dupValue = new HashMap();
		char ary[] = name.toCharArray();
		for(char keys:ary)
		{
			if(Character.isAlphabetic(keys))
			{
				if(dupValue.containsKey(keys))
				{
					dupValue.put(keys, dupValue.get(keys)+1);
				}
				else 
				{
					dupValue.put(keys, 1);
				}
			}
		}
		System.out.println(dupValue);
	}

}
