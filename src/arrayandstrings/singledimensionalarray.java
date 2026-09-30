package arrayandstrings;

import java.util.Scanner;

public class singledimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[6];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		
		System.out.println("Array length :"+(arr.length));
		System.out.println(arr[3]);//random access
		
		System.out.println("Elements:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//array declaration with initialization
		int array[]= {10,20,30,40};
		System.out.println(array[3]);
		for(int i=0;i<4;i++) {
			System.out.println(array[i]);
		}
		
		//initialization using scanner
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=scan.nextInt();
		
		System.out.println("Enter elements:");
		int arr1[]=new int[size];
		for(int i=0;i<size;i++) {
			arr1[i]=scan.nextInt();
		}
			System.out.println("Elements are:");
			for(int i=0;i<size;i++) {
				System.out.println(arr1[i]);
				
	}

}
}
