package stringsinjavaprograms;

public class TotalVovel 
{
	public static void main(String[] args) 
	{
		String s="Rishikesh Pal";
		int x=s.length();
		char a[]= new char[x];
		a=s.toCharArray();
		System.out.println(a);
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a' || a[i]=='e' || a[i]=='i' ||a[i]=='o' ||a[i]=='u' ||a[i]=='A' ||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U' )
			{
				k++;
			}
		}
		System.out.println("vovels are : "+k);
		System.out.println("consonents are: " +(x-k));
		
	}
}
