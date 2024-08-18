package array;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 총합,평균 구하기
		int[] arr= {10,20,30,50,3,60,-3};
		int sum=0;
		int average=0;
		for (int i=0;i<arr.length;i++) {
			sum += arr[i];
			average=sum/arr.length;
		}
		System.out.println("총합: "+sum);
		System.out.println("평균: "+average);

		
		//배열의 최댓값, 최솟값 구하기
		int[] array= {10,20,30,50,3,60,-3};
		int max = array[0];
		int min = array[0];
		for (int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("최댓값: "+max+" 최솟값: "+min);
		
		
		
		
		
		int[] arr1= {5,8,4,9,22,23};
		//22출력
		int result = arr1[4];
		System.out.println(result);
		//49출력
		int result2= arr1[0]*arr1[1]+arr1[3];
		System.out.println(result2);
		
	}

}
