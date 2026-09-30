package operators;

import java.util.Scanner;

public class task1operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of a:");
		boolean a=scan.nextBoolean();
		System.out.println("Enter value of b:");
		boolean b=scan.nextBoolean();
		boolean exp=!(a||b);
		System.out.println("exp="+exp);
		
		//2.
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter value of a2:");
		boolean a2=scan2.nextBoolean();
		System.out.println("Enter value of b2:");
		boolean b2=scan2.nextBoolean();
		boolean exp2=!(a2&&b2);
		System.out.println("exp2="+exp2);
		
		//3.
		Scanner scan3=new Scanner(System.in);
		System.out.println("Enter value of a3:");
		boolean a3=scan3.nextBoolean();
		System.out.println("Enter value of b3:");
		boolean b3=scan3.nextBoolean();
		boolean exp3=!((a3||b3)&&(a3||b3));
		System.out.println("exp3="+exp3);
		
		//4.
		Scanner scan4=new Scanner(System.in);
		System.out.println("Enter value of a4:");
		boolean a4=scan4.nextBoolean();
		System.out.println("Enter value of b4:");
		boolean b4=scan4.nextBoolean();
		boolean exp4=!((a4&&b4)||(a4&&b4));
		System.out.println("exp4="+exp4);
		
	}

}
