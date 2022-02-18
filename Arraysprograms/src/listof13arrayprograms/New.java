package listof13arrayprograms;

public class New 
{

	public static void main(String[] args) 
	{
	int a[]= {1,3,2,0,5,8,7};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int x=0;
				x=a[i];
				a[i]=a[j];
				a[j]=x;
			}
		}
	}
	
	
	System.out.println();
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println();
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	
	System.out.println();
	for(int i=0;i<a.length;i=i+2)
	{
		System.out.println("element "+i + " : "+a[i]);
	}
	
	System.out.println();
	for(int i=1;i<a.length;i=i+2)
	{
		System.out.println("element "+i + " : "+a[i]);
	}
	
	System.out.println();
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("largest element is : "+max);
	
	System.out.println();
	System.out.println("even");
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
		
	}
	System.out.println("Odd");
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]%2!=0)
		{
			System.out.println(a[i]);
		}
		
	}
	
	int x[]=new int[a.length];
	for (int i=0;i<a.length;i++)
	{
		x[i]=a[i];
	}
	for(int i =0;i<x.length;i++)
	{
		System.out.println(x[i]);
	}
	
	
	}

}
