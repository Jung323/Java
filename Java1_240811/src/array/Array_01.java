package array;

import java.util.Arrays;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2차원 배열
		int [][] array = new int[2][3];
		for (int k=0;k<array.length;k++) {
			System.out.println(Arrays.toString(array[k]));
		}
		
		int[][]arr=new int[4][3];
		int num=0;
		for(int i=0;i<4;i++) {
			for (int j=0;j<3;j++){
				arr[i][j]=num++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][]arr1=new int[5][5];
		int num1=45;
		for(int m=0;m<5;m++) {
			for(int n=0;n<5;n++) {
				arr1[m][n]=num1--;
				System.out.print(arr1[m][n]+" ");
			}
			System.out.println();
		}
		
	}

}
