class Main
{
	public static void main(String args[])
	{
		Sample a2=new Sample("java",10);
	}
}

class Sample
{
	Sample()
	{
		System.out.println("Default constructor");
	}

Sample(String str)
{
	this();
	System.out.println("one argument constructor:"+str);
}
Sample(String str,int no)
{
	this(str);
	System.out.println("Two arguments constructor:"+no);
}
}
