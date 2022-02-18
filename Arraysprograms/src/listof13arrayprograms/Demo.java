package listof13arrayprograms;

public class Demo {

	public static void main(String[] args) 
	{
		String a= "Rishikesh";
		char b[]=a.toCharArray();
		int k=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]=='a'||b[i]=='A'||b[i]=='e'||b[i]=='E'||b[i]=='i'||
					b[i]=='I'||b[i]=='o'||b[i]=='O'|b[i]=='u'||b[i]=='U')
			{
				System.out.println(b[i]);
				k++;
			}
		}
		System.out.println("vovels "+k);
		System.out.println("consonents "+(a.length()-k));
	}

}
