package stringsinjavaprograms;

public class Frequency 
{
public static void main(String[] args) 
{
			// 012345678
	String a ="Rishikesh";
	char b[]=a.toCharArray();
	char c[]=new char[b.length];
	int visited[]=new int[c.length];
	int visit=-1;
	for(int i=0;i<b.length;i++)
	{
		int count=1;
		for(int j=i+1;j<b.length;j++)
		{
			if( b[i]==b[j])
			{
				count++;
				visited[j]=visit;
			}
		}
		if(visited[i]!=visit)
		{
			visited[i]=count;
		}
	}
	for(int i=0 ;i<b.length;i++)
		{
			//if(visited[i]!=visit)
			System.out.println("frequency of "+b[i]+" is "+visited[i]);
		}
}
}
