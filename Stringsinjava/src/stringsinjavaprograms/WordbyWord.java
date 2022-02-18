package stringsinjavaprograms;

public class WordbyWord 
{

	public static void main(String[] args) 
	{
		 System.out.println("BEFORE REVERSE:");
		    String str="I love cats and dogs";
		    String a[] = str.split(" ");//after every space we have to split
		    
		    for(int i=0;i<a.length;i++)
		    {
		    	 System.out.print(a[i] +" ");
		    }
		   System.out.println();
		    System.out.println("After REVERSE:");
		    
		    for(int i=a.length-1;i>=0;i--)
		    {
		    	 System.out.print(a[i] +" ");
		    }
			
	}

}
