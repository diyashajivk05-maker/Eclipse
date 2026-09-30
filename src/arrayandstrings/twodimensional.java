package arrayandstrings;

public class twodimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[2][3];
		
		arr[0][1]=10;
		arr[1][2]=20;
		arr[2][3]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		int arr1[][]= {{10,20},{30,40},{50,60}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arr1[i][j]+" ");
		}
			System.out.println();
				}
		
		
		

	}

}
