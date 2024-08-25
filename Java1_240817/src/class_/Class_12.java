package class_;

public class Class_12 {
	private int age;
	//Class_12 클래스 안에서만 접근 가능한 age 필드 선언
	
	//setter 메서드
	void setAge(int num) {
		if(num<=0) {
			System.out.println("잘몬된 수를 입력하셨습니다. 1 이상으로 값을 설정하세요.");
			return; //메서드종료
		}
		else {
			age = num; //age 필드에 num 값 저장
		}
	}
	
	//getter 메서드
	int getAge() {
		return age;
	}
}
