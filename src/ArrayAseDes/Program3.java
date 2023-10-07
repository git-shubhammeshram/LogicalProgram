package ArrayAseDes;

public class Program3 {
	public static void main(String[] args) {
		int ary[] = new int [] {5,2,8,6,9,0};
		int value = 0;
		for(int i=0;i<ary.length;i++)
		{
			System.out.print(ary[i]);
		}
		
		for(int i=0;i<ary.length;i++)
		{
			for(int j=i+1;j<ary.length;j++)
			{
				if(ary[i]>ary[j])
				{
					value = ary[i];
					ary[i] = ary[j];
					ary[j] = value;
				}
			}
		}
		System.out.println();
		for(int i=0;i<ary.length;i++)
		{
			System.out.print(ary[i]);
		}
	}

}
