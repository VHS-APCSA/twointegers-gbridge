package twointegers;

import java.util.Scanner;

public class TwoIntergersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an int");
		int intone = input.nextInt();
		System.out.println("Enter Another Int");
		int inttwo = input.nextInt();
		TwoIntergers runner = new TwoIntergers(intone, inttwo);
		String numbers = runner.arithmatic();
		System.out.println(numbers);
		String numbers2 = runner.larger();
		System.out.println(numbers2 + " is larger");
		Boolean numbers3 = runner.even();
		System.out.println("it's " + numbers3 + " that the first interger is even");
		Boolean numbers4 = runner.even2();
		System.out.println("it's " + numbers4 + " that the first interger is even");
		Boolean numbers5 = runner.remainder();
		System.out.println("it's " + numbers5 + " mthat the numbers are multiples");
	}
}
