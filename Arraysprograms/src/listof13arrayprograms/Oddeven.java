package listof13arrayprograms;

public class Oddeven 
{

	public static void main(String[] args) 
	{
		System.out.println("Even");
		int a[]= {4,5,6,7,8,9,11};
		//even number
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(i + " element is " + a[i]);
		}
		System.out.println();
		System.out.println("ODD");
		for(int j=1;j<a.length;j=j+2)
		{
			System.out.println(j + " element is " + a[j]);
		}
	}

}
