package inheritance;



//## 상속(Inheritance)
//## 상속의 기본구조
//class 부모클래스{
//	부모클래스의 멤버 변수와 메서드
//}

//class 자식클래스 extends 부모클래스{
//	자식 클래스의 추가적인 멤버 변수와 메서드
//}

//자바는 단일 상속만을 지원함. 
//즉, 하나의 클래스는 하나의 부모 클래스만을 가질 수 있음

//부모클래스 : 차량(Vehicle)
class Vehicle{
	String brand;
	
	Vehicle(String brand){
		this.brand =brand;
	}
	
	void start() {
		System.out.println(brand+ "차량 시동을 걸다.");
	}
	void stop() {
		System.out.println(brand+"차량을 정지시킨다.");
	}
}

//자식 클래스: 자동차(Car)
class Car extends Vehicle{
	String model;
	Car(String brand, String model){
		super(brand);
		// 부모 생성자를 호출하는 코드
		// 부모가 가지는 속성(멤버변수 == brand)를 자식 클래스에서도 명시적으로 기재하지 않아도 가짐
		// 부모가 가지는 속성에 대한 초기화 코드(this.brand = brand)를 부모 클래스가 가지고 있기 때문에(매개변수 생성자에서),
		// 자식클래스에서 brand에 대한 초기화는 부모 생성자를 활용해서 초기화를 한다면 좀 더 효율적임
		this.model =model;
	}
	void accelerate() {
		System.out.println(brand+"차량이 가속한다.");
	}
	void brake() {
		System.out.println(brand+"차량이 제동한다.");
	}
}



public class C01inheritanceCar {
	public static void main(String[] args) {
		Car myCar = new Car("Porsche","911 turbo");
		
		myCar.start();
		myCar.accelerate();
		myCar.brake();
		myCar.stop();
	}

}
