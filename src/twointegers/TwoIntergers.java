package twointegers;

public class TwoIntergers 
{
	private int one;
	private int two;
	public TwoIntergers()
	{
		this.one = 0;
		this.two = 0;
	}
	public TwoIntergers(int one, int two)
	{
		this.one = one;
		this.two = two;
	}
	public int getOne()
	{
		return one;
	}
	public int getTwo()
	{
		return two;
	}
	public void setOne(int one)
	{
		this.one = one;
	}
	public void setTwo(int two)
	{
		this.two = two;
	}
	public String arithmatic()
	{
		int sum = one + two;
		if(one < two)
		{
			int difference = two - one;
		}
		else
		{
			int difference = one - two;
		}
		int product = one*two;
		if(two*two> 0)
		{
			double quotient = (double)one/two;
		}
		else
		{
			System.out.println("no deviding by 0");
			double quotient = 0.0;
		}
		return("Sum: " + sum + ", Difference: " + difference + ", product: " + product + ", quotient: " + quotient);
		
	}
}
