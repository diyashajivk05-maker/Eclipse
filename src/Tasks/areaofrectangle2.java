package Tasks;

import java.util.Scanner;

public class areaofrectangle2 {
	public void area(int length,int breadth) {
		System.out.println("area="+(length*breadth));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length:");
		int l=scan.nextInt();
		System.out.println("enter breadth:");
		int b=scan.nextInt();
		areaofrectangle2 ob=new areaofrectangle2();
		ob.area(l,b);
	}

}
