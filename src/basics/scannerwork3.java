package basics;

import java.util.Scanner;

public class scannerwork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int x;
		int y;
		int z;
		int exp;
		System.out.println("Enter x:");
		x=scan.nextInt();
		System.out.println("Enter y:");
		y=scan.nextInt();
		System.out.println("Enter z:");
		z=scan.nextInt();
		exp=x+z/x+(z%y)*(z-x);
		System.out.println(exp);
		scan.close();
	}

}
