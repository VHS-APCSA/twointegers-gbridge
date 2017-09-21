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
		int difference = 0;
		double quotient = 0.0;
		if(one < two)
		{
			int diff = two - one;
			difference = diff;
		}
		else
		{
			int diff = one - two;
			difference = diff;
		}
		int product = one*two;
		if(two*two> 0)
		{
			double quo = (double)one/two;
			quotient = quo;
		}
		else
		{
			System.out.println("no deviding by 0");
			quotient = 0.0;
		}
		return("Sum: " + sum + ", Difference: " + difference + ", product: " + product + ", quotient: " + quotient);
	}
	public String larger()
	{
		//return "";
		if(one > two)
		{
			return(one + "");
		}
		else if(one < two)
		{
			return(two + "");
		}
		else
		{
			return("NaN");
		}
	}
	public boolean even()
	{
		if(one % 2 > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean even2()
	{
		if(two % 2 > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean remainder()
	{
		if((one % two) * (two % one) > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
