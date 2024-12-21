package inheritance;

//## Overide == 덮어쓰기
// 상속관계에서 부모 클래스의 메서드를 자식 클래스가 내용만 바꾼 채로 사용하는 기술
// == 메서드의 헤더부분은 동일함

// 조건
// 1. 메서드 헤더가 동일해야함
// 2. 바디 부분만 다르게 작성해야함.
// 3. 접근 제어자 : 부모 클래스와 같거나 더 넓은 범위로 설정해야함. 
// ex)부모클래스가 public이면 public과 같거나 더 넓은 범위의 접근 제어자를 사용해야함

class NewCar{
	public void driveSound() {
		System.out.println("차가 운전 중입니다.");
	}
}

class Sedan extends NewCar{
	
	@Override  
	// 1. 문법 체크 기능 == 오버라이딩을 하겠다! 라고 말했으니 했는지 확인가능
	// 2. 가시적인 기능 == 개발자와의 협업에서 오버라이딩했다는 의미 부여

	public void driveSound() {
		System.out.println("세단이 조용히 운전 중입니다.");
	}
}

class SportsCar extends NewCar{
	 //꼭 적지 않아도 조건이 충족되면 override 된다.
	public void driveSound() {
		System.out.println("스포츠카가 빠르게 운전 중입니다.");
	}
}


public class C03Overriding {
	public static void main(String[] args) {
		Sedan sd = new Sedan();
		SportsCar sp = new SportsCar();
	
		
		sd.driveSound();
		sp.driveSound();
	}
}
