package classsroomtask;

import java.util.Scanner;

public class converttobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("decimal number:");
		int decimal=scan.nextInt();
		String binary=Integer.toBinaryString(decimal);
		System.out.println("binary number is:"+binary);

	}

}
