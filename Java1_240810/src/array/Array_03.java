package array;

import java.util.Arrays;

public class Array_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드를 이용해서 배열의 값을 출력
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		
		//반복문을 이용해서 배열의 값을 출력
		int[] arr1=new int[10];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=i+1;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		//길이가 10인 배열을 선언하고 1부터 10까지의 갑을 역순으로 배열 인덱스에 넣은 후 출력하기
		int[] arr2=new int[10];
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=10-j;
			System.out.print(arr2[j]+" ");
		}
		System.out.println();
		//길이가 5인 String 배열을 선언하고 사과,귤,포도,복숭아,참외로 초기화한 후 귤을 출력하세요
		String[] fruit=new String[5];
		fruit = new String[] {"사과","귤","포도","복숭아","참외"};
		System.out.println(fruit[1]);
			
		
	}

}
