package ArrayAseDes;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[] = new int [] {2,4,6,5,3,8};
		int value = 0;
		
		for(int i=0;i<ary.length;i++)
		{
			for(int j=i+1; j<ary.length; j++)
			{
				if(ary[i]> ary[j])
				{
					value = ary[i];
					ary[i] = ary[j];
					ary[j] = value;
				}
			}
		}
		for(int i=0; i<ary.length;i++)
		{
			System.out.print(ary[i]);
		}

	}

}
