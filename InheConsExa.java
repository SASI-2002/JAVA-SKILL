class A
{
	int a;
	
	A(int val)
	{
		a=val;
	}

}

class B extends A
{
	int b;
	B()
	{
		super(50);
		b=20;
		System.out.println("in class B constructor");
	}
	
}
class c1
{
	public static void main(String args[])
	{
		
		B s1=new B();
		System.out.println(s1.a+" "+s1.b);
	}

}