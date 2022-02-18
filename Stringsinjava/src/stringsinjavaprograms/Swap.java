package stringsinjavaprograms;

public class Swap {

	public static void main(String[] args) 
	{
		String a ="Rishikesh";//9
		String b = " Pal";//4
		System.out.println(a.length());
		System.out.println(b.length());
		
		 System.out.println("Beforeswap: " + a + " " + b);
		 a=a+b;//13//Rishikesh pal
		 b=a.substring(0,a.length()-b.length());//13-4=9
		 a=a.substring(b.length());//4
		System.out.println("After swap: " + a + " " + b);
	      
	}

}
