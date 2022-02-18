package listof13arrayprograms;

public class Duplicateelements 
{
	public static void main(String[] args) 
	{
		int a[]= {1,3,3,2,2,5,1,5,0,8};
		//		0 1
		int x=0;
		System.out.println("Duplicate elements are: ");
		
		for(int i=0;i<a.length;i++)//i=0
		{	
			for(int j=i+1;j<a.length;j++)//j=12
			{
				if (a[i]==a[j]) //13
				{
					x=a[i];
					System.out.println(x);
				}
				
			}
		}
		
//		for (int i=0;i<b.length;i++)
//		{
//			System.out.print(" " + b[i]);
//		}
		
		

	}

}
