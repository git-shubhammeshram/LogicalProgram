package ArrayAseDes;

public class Program1 {

	public static void main(String[] args) {

		int ary[] = new int[] {4,7,8,2,9,5};
		int temp = 0;
//		System.out.println(ary.length);
		System.out.println("Before sorting values are -");
		for(int i=0;i<ary.length;i++)
		{
			System.out.print(ary[i]);
		}
		
		for(int i=0;i<ary.length;i++)
		{
			for(int j=i+1;j<ary.length;j++)
			{
				if(ary[i] > ary[j])
				{
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After ase values are -");
		for(int i=0;i<ary.length;i++)
		{
			System.out.print(ary[i]);
		}

	}

}
