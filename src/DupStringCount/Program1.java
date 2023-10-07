package DupStringCount;

import java.util.HashMap;
import java.util.Map;

public class Program1 {

	public static void main(String[] args) {
		String name  = "Shubham Meshram";
		Map<Character,Integer> value = new HashMap();
		char ary1[] = name.toCharArray();
		
		for(char keys:ary1)
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
		System.out.print(value);

		
	}

}
