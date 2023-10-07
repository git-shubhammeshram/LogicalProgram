package ArrayAseDes;

public class Program2 {

	public static void main(String[] args) {
		
		int ary[] = new int [] {8,3,4,5,0,7,1,3};
		int temp = 0;
		
		for(int i=0;i<ary.length;i++)
		{
			for(int j=i+1;j<ary.length;j++)
			{
				if(ary[i]<ary[j])
				{
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}
		for(int i=0;i<ary.length;i++)
		{
			System.out.print(ary[i] + " ");
		}
	}

}
