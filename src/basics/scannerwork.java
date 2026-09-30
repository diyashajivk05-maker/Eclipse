package basics;

import java.util.Scanner;

public class scannerwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int A;
		int b;
		System.out.println("Enter A:");
		System.out.println("Enter b:");
		A=scan.nextInt();
		b=scan.nextInt();
		int mod;
		mod=A%b;
		System.out.println("mod="+mod);
		scan.close();
	}

}
