package constructor;

public class Constructor_01 {
		//생성자(constructor)
		//객체를 생성할 떄 호출되어 객체의 초기화를 담당하는 특별한 메서드
		//클래스명(매개변수1,매개변수2'''){'''}
		//클래스명 객체명 = new 클래스명(); 
		//이렇게 한게 다 생성자로 객체를 생성하는 것
	
		int price;
		
		
		//기본 생성자: 이 코드는 없어도 됨.
		Constructor_01(){
			
		}
		
		void info() {
			System.out.println("과자의 가격은 "+price+"입니다.");
		}
		
}
