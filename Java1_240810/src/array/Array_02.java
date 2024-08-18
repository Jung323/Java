package array;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 인덱스는 0부터 시작
		
		//배열의 구조
		int[] arr = new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[1]="+arr[1]);
		System.out.println("arr[2]="+arr[2]);
		System.out.println("arr[3]="+arr[3]);
		
		System.out.println(arr.length);
		
		//배열의 출력과 정렬
		int[] arr1 = {1,2,3,4,5};
		System.out.println(arr1); //배열의 주소값이 출력
		//반복문이나 특별한 메소드를 사용해야 값을 출력할 수 있음
		
		int[] arr2= {1,2,3,4,5};
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
	}

}
