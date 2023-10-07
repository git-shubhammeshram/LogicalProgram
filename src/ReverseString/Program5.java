package ReverseString;

public class Program5 {

	public static void main(String[] args) {

		String name = "Shubham";
		String reName = "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			reName = reName+name.charAt(i);
		}
		System.out.println(reName);
	}

}
