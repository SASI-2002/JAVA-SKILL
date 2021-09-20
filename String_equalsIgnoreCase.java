import java.lang.String;
class String_equalsIgnoreCase
{	public static void main(String args[])
	{	String s1="HE";
		String s2="hE";
		String s3=new String("HE");
		String s4=new String("hE");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.equalsIgnoreCase(s4));
		//System.out.println(s3==s4);
		//System.out.println(s1==s2);
	}

}