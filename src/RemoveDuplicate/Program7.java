package RemoveDuplicate;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program7 {

	public static void main(String[] args) {String name = "Shuuubhaaammm";
	StringBuffer reName = new StringBuffer();
	LinkedHashSet x = new LinkedHashSet();

	for(int i=0; i<name.length(); i++)
	{
	x.add(name.charAt(i));
	}

	for(Object value:x)
	{
	reName.append(value);
	}
	System.out.println(reName);
}

}
