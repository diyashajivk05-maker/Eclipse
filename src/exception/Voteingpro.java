package exception;

import java.util.Scanner;

public class Voteingpro {

	public static void main(String[] args) throws Agelimitexception{
		System.out.println("enter your age:");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		try
		{
			if(age<18)
			{
				throw new Agelimitexception("below 18 not eligible");
			}
			else
			{
				System.out.println("eligible to vote");
			}
		}
		catch(Agelimitexception e)
		{
			System.out.println(e);
		}
		System.out.println("hai");
	}

}
