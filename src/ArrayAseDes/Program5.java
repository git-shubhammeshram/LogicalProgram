package ArrayAseDes;

public class Program5 {

	public static void main(String[] args) {

		int ary[] = new int[] {4,5,3,8,1,9,2,6};
		int temp = 0;
		
		for(int i=0; i<ary.length; i++)
		{
			for(int j=i+1; j<ary.length; j++)
			{
				if(ary[i] > ary[j])
				{
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}
		for(int i=0; i<ary.length; i++)
		{
			System.out.print(ary[i]);
		}
	
		
	}

}
