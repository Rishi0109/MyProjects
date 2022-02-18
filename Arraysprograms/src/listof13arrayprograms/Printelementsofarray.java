package listof13arrayprograms;

public class Printelementsofarray {

	public static void main(String[] args) 
	{
			int a[]= {9,8,7,6,5,4};
			System.out.println("Elements of array are");
			for (int i=0; i<a.length;i++)
			{
				System.out.println(i + " element is " + a[i]);
			}
			
			// Reverse order
			System.out.println();
			System.out.println("Elements in Reverse order is");
			for(int j=a.length-1; j>=0 ; j--)
			{
				System.out.println(j + " Element is " + a[j]);
			}

	}

}
