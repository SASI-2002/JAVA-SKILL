class return_type
{	int why(int value)
	{	return value*2/1;
	}
	double balance;
	int min_balance=5000;
	void salary(int value)
	{	balance=balance+value;
	}
	double getbalance()
	{	return balance;
	}
	double withdraw(double value)
	{	if (value<balance-min_balance)
		{	balance=balance-value;
			return value;
		}
		else
		{	System.out.println("Insufficient balance");
			return -1;
		}
			
	}
	public static void main(String args[])
	{ 	return_type r=new return_type();
		r.salary(6000);
		System.out.println(r.getbalance());
		System.out.println(r.withdraw(1100));
			
	}


}