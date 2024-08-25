package constructor;

public class Constructor_02 {
	//생성자는 객체를 생성함과 동시에 객체를 초기화할 수 있다.
	//초기화= 객체를 사용하기 위해서 메모리에 올린다.
	int price;
	
	
	//직접 선언한 생성자
	Constructor_02(int p){
		price = p;
	}
	
	void info() {
		System.out.println("과자의 가격은 "+price+"입니다.");
	}
	
}
