package array;

public class Array_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,4,3,1,4,4,2,1};
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			for(int j=1;j<=arr[i];j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
