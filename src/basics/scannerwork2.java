package basics;

import java.util.Scanner;

public class scannerwork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num;
		int c;
		System.out.println("Enter num:");
		System.out.println("Enter c:");
		num=scan.nextInt();
		c=scan.nextInt();
		int div;
		div=num/c;
		System.out.println("div="+div);
		scan.close();

	}

}
