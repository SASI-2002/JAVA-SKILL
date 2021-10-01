class A
{
	int a;
	A()
	{
		a=10;
		System.out.println("in class A constructor");
	}
}

class B extends A
{
	int b;
	B()
	{
		b=20;
		System.out.println("in class B constructor");
	}
}
class c
{
	public static void main(String args[])
	{
		A s1=new A();
		System.out.println(s1.a);

		B s2=new B();
		System.out.println(s1.a+" "+s2.b);
	}
}