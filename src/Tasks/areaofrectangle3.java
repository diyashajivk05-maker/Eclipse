package Tasks;

import java.util.Scanner;

import methodsandconstructor.category3;

public class areaofrectangle3 {
	public int mul() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length:");
	int a=scan.nextInt();
	System.out.println("enter the breadth ");
	int b=scan.nextInt();
	return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaofrectangle3 ob=new areaofrectangle3();
		System.out.println(ob.mul());

	}

}
