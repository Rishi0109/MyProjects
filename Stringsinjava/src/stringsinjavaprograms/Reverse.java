package stringsinjavaprograms;

public class Reverse
{
	public static void main(String[] args) 
	{
		String a="Rishikesh";
		int x=a.length();
		char b[] =new char[x];
		
		b=a.toCharArray();
		System.out.println(b);
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}
		
	}
}
