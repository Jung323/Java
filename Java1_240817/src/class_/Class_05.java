package class_;

public class Class_05 {
	//정적 필드 선언
	static String schoolName="코리아 고등학교";
	
	//인스턴드 필드 선언
	String studentName;
	
	//메서드(Method): 클래스 안에 특정 기능을 수행하기 위해 코드들을 따로 하나의 블록으로 묶어 놓은 집합
	//정적 메서드 선언
	static void goToShool() {
		System.out.println("학교에 갑니다.");
	}
	
	//인스턴드 메서드 선언
	void hello() {
		System.out.println("안녕하세요, 제 이름은 "+studentName+"입니다.");
	}
}
