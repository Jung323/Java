package class_;

public class MainClass_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반환값이 없는 경우
		int nums[]= {100,200};
		Class_09 calc = new Class_09();
		calc.sum(nums);
		
		
		//반환값이 있는 경우
		int nums2[]= {500,200};
		Class_09 calc2 = new Class_09();
		//cal2 인스턴스의 sum2메서드를 호출하여 return된 결과 값을 출력
		System.out.println("숫자들의 합은 "+ calc2.sum2(nums2)+"입니다.");;
	}

}
