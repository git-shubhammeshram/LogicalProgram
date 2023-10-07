package ReverseString;

public class Program4 {

	public static void main(String[] args) {

		String name = "Shubham";
		String revName = "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			revName = revName + name.charAt(i);
		}
		System.out.println(revName);
	}

}
