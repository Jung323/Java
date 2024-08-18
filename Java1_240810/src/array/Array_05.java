package array;

public class Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열의 복사
		//얕은 복사: 복사된 배열이나 원본 배열이 변경될 때, 서로 간의 값이 함께 변경됨
		//깊은 복사: 복사된 배열이나 원본 배열이 변경될 떄, 서로 간의 값은 바뀌지 않음
		
		//얕은 복사
		int[] A= {1,2,3,4,5};
		int[] B = A;
		B[0]=999;
		System.out.println("B를 바꿨을 때 A의 값은? "+ A[0]);
		
		//깊은 복사
		int[] C= {1,2,3,4,5};
		int[] D=C.clone();
		D[0]=999;
		System.out.println("D를 바꿨을 때 C의 값은? "+ C[0]);
		
	}

}
