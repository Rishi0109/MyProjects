package listof13arrayprograms;

public class Sorting {

	public static void main(String[] args) 
	{
		int a[]= {5,3,1};
				//012
		
		for(int i=0;i<a.length ;i++)//0
		{
			for(int j=i+1 ; j<a.length ; j++)//1234
			{
				if (a[i]>a[j]) //5
				{
					int x=0;
					x=a[i];//5
					a[i]=a[j];//a[0]=3
					a[j]=x;//
					
				}
				
			}
					
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("secound largest number is : "+ a[a.length-2]);
			

	}

}
