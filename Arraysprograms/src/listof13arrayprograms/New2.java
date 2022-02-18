package listof13arrayprograms;

public class New2 {

	public static void main(String[] args) {
		int[] k= {10,20,25,555,145,256,456};
		 System.out.println("Even numbers");
		 
		 for (int i=0;i<k.length;i++)
		 {
			     if(k[i]%2==0)
				 System.out.println(k[i]);
		 }
		 System.out.println("Odd numbers");
		 
		 for (int i=0;i<k.length;i++)
		 {
			     if (k[i]%2!=0) 
			     {
				 System.out.println(k[i]);
			     }
		 }

	}

}
