package listof13arrayprograms;

public class Largestno 
{
public static void main(String[] args) 
{
	int b[]= {2,0,2,4,1,5};
			//012345
	int max=b[0];
	System.out.println(" length is : "+ b.length);
	for(int i=1;i<b.length;i++)
	{
		if(b[i]>max)
		{
			max=b[i];
		}
	}
	System.out.println("max number in array is " + max);
	

	
	
}
}


// i=0 b[0]=1 max=1
//i=1 b[1]=2 max=2
//i=2 b[2]=3 max=3
//// i=3 b[3]=4 max=4
//i=4 b[4]=9 max=9
//i=5 b[5]=8 max=9
//i=6 b[6]=7 max=9

