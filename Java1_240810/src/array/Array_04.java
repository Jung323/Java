package array;

import java.util.Arrays;

public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//버블 정렬
		//각 자리를 비교한 후 가장 큰 수를 뒤로 보낸다
		int[] arr= {6,3,4,1,5,2};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]+" ");
		}
		
		//메소드를 이용한 오름차순 정렬
		int[]arr1= {1,6,2,3,10,7,4,5,8,9};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}

}
