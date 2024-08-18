package class_;

public class Class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스(class): 객체의 속성과 기능을 코드로 구현한 것
		//클래스는 실행용과 라이브러리용으로 나뉜다. 
		//클래스 생성 시 체크한 것이 실행용 클래스로 사용한 것
		
		//클래스 선언
		/*
		public class 클래스이름{
			
		}
		*/
		//private 멤버는 class 외부에서 접근할 수 없는 변수를 의미한다.
		//public 멤버는 class 외부에서 접근할 수 있는 변수를 의미한다.
		
		
		//Car 클래스를 이용해서 객체 생성
		Car c= new Car();
		
		
		//클래스 구성
		//필드(field): 객체가 가져야 할 데이터 상태를 저장하는 변수
		
		c.wheel=4;
		System.out.println("wheel의 개수는 "+c.wheel+"개 입니다.");

		//메서드(method): 객체의 기능을 담당하는 {} 중괄호 블록
		
		//return 값이 있을 경우: return값의 자료형을 반환 타입으로 작성
		//return 값이 없을 경우: 반환 타입을 void라고 작성
		
		
		//메서드 호출
		c.ride();

		
		//생성자(constructor): 객체를 생성하면서 객체 변수를 초기화하는 역할
		//객체명 = new 클래스명(); new가 생성자
	}

}
