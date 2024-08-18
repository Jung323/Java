package practice;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열
		
		int [][] array = new int[2][3];
		for (int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]));
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
	

	}

}
