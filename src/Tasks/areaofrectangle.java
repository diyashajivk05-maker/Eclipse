package Tasks;

import java.util.Scanner;

import methodsandconstructor.categories;

public class areaofrectangle {
	public void areaofrectangle() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length:");
		int l=scan.nextInt();
		System.out.println("enter breadth ");
		int b=scan.nextInt();
		System.out.println("area of rectangle="+(l*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaofrectangle ob=new areaofrectangle();
		ob.areaofrectangle();
	}

}
