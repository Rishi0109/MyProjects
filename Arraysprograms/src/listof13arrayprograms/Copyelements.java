package listof13arrayprograms;

public class Copyelements 
{
  public static void main(String[] args) 
  {
	  int a[]= {2,4,3,6,7,8,9};
	  int b[]= new int[a.length];
	  System.out.println("elements of b are: " );
		 
//	  for (int i=0;i<a.length;i++)
//	  {
//		System.out.print(" " +b[i]);  
//	  }
//	  System.out.println();
//	  System.out.println("elements of a are: " );
//	 
//	  for (int i=0;i<a.length;i++)
//	  {
//		System.out.print(" " +a[i]);  
//	  }
//	  System.out.println();
//	  System.out.println("elements of b are: " );
	  
	  for(int i=0;i<a.length;i++)
	  {
		  b[i]=a[i];
		  System.out.print(" " +b[i]);
	  }
}
}
