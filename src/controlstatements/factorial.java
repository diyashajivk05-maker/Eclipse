package controlstatements;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		do {
			fact=fact*i;
			System.out.println("factorial="+fact);
			i++;
		}
		while(i<=num);

	}

}
