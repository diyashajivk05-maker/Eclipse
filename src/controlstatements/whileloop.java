package controlstatements;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		do {
			System.out.println(i+"*"+num+"="+(i*num));
			i++;
		}
		while(i<=10);
	}

}
