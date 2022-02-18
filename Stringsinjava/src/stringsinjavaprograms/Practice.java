package stringsinjavaprograms;

public class Practice 
{

	public static void main(String[] args) 
	{
		String s="If you want to represent any object as a string";
		int x=s.length();
		char a[]= new char[x];
		a=s.toCharArray();
		System.out.println(a.length);
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]=='a' ||a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u' )
			{
				t++;
			}
			
		}
		System.out.println("vovels "+t);
		System.out.println("consonents "+(x-t));
		
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
		
	}

}
