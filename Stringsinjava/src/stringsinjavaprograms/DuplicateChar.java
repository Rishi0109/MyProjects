package stringsinjavaprograms;

public class DuplicateChar {

	public static void main(String[] args) 
	{			 //012345678
		String a= "rishikesh";
		char b[]= new char[a.length()];
		b=a.toCharArray();
		System.out.println("Duplicate Elements Are: ");
		for(int i=0;i<a.length();i++)//I=0
		{
			for (int j=i+1;j<a.length();j++)//b[1]=is
			{
				if (b[i]==b[j])//r==i,r==s
				{
					
					System.out.println(b[i]);
					
				}
					
			}
		}

	}

}
