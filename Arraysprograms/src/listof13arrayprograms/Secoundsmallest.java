package listof13arrayprograms;

public class Secoundsmallest {

	public static void main(String[] args) 
	{
		{
			int a[]= {5,3,1,2,0,4,8};

			
			for(int i=0;i<a.length ;i++)
			{
				for(int j=i+1 ; j<a.length ; j++)
				{
					if (a[i]<a[j])//5<8
					{
						int x=0;
						x=a[i];//x=5
						a[i]=a[j];//8
						a[j]=x;//5
						
					}
					
				}
						
			}
			for (int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println("secound smallest number is : "+ a[a.length-2]);
				

		}	

	}

}
