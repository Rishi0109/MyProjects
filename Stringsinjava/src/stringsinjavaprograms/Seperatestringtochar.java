package stringsinjavaprograms;

public class Seperatestringtochar 
{
 public static void main(String[] args) {
	 {
			String a="Rishikesh";
			int x=a.length();
			char b[] =new char[x];
			
			b=a.toCharArray();
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
			
		}
}
}
