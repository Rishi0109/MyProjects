package listof13arrayprograms;

public class FrequencyOfEach 
{
	public static void main(String[] args) 
	{				
	int a[]= {1,2,1,3};
	int visited[]=new int[a.length];
	
	int visit=-1;
	for(int i=0;i<a.length;i++)
	{
		int count=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
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
	for(int i=0 ;i<a.length;i++)
	{
//		if(visited[i]!=visit)
		System.out.println("frequency of "+a[i]+" is "+visited[i]);
	}
		
	}
}
