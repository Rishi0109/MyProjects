package stringsinjavaprograms;

public class First 
{
public static void main(String[] args) 
{
	String a = " Rishikesh Pal";
	System.out.println(a);
	
	String b = new String (" Pal");
	System.out.println(b);
	
	String c = "Rishikesh pal";
	System.out.println(c);
	
//	System.out.println("Length of String is: "+c.length());
//	System.out.println(c.charAt(5));
//	System.out.println(a.concat(b));
//	System.out.println(a.toUpperCase());
//	System.out.println(a.toLowerCase());
//	System.out.println(a.startsWith(" Rishikesh"));
//	System.out.println(a.endsWith(b));
//	System.out.println(a.equals(c));
//	System.out.println(a.equalsIgnoreCase(c));
//	System.out.println(a.substring(5));
//	System.out.println(a.substring(2, 10));
//	System.out.println(a.trim());
	
	String x="Apple";
	String y="Apple";
	System.out.println(x.equals(y));
	System.out.println(x==y);
	x="Apple1";
	System.out.println(x==y);
}
}
