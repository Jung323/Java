package array;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열(Array)
		//같은 자료형의 변수를 지정하여 여러 데이터를 저장할 수 잇는 저장 공간
		//변수는 1개의 데이터만 저장할 수 있지만 배열은 여러 개의 데이터를 저장하고 관리함
		
		//배열의 선언과 생성
		//자료형 [] 변수이름;
		//자료형 변수이름 [];
		/*
		ex) 
		int [] arr;
		int arr[];
		*/
		
		//메모리에 배여릐 데이터를 저장하기 위한 4개의 공간을 만들기
		int [] arr1=new int[4];
		int [] arr2= {1,2,3,4,5}; //최초선언일떄만 이렇게 가능

		//예를 들어 이렇게하면 오류
		/*
		int [] arr;
		arr= {1,2,3,4,5};
		*/
		
		//배열의 재정의
		int[] arr3;
		arr3=new int[] {1,2,3,4,5};

	
	}

}
