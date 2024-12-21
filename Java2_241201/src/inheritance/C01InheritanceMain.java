package inheritance;
class Parent{
	int num1;
	int num2;
	
	public Parent() {
		System.out.println("[Parent] : Default 생성자");
	}
	public Parent(int num1) {
		System.out.println("[Parent] : num1 매개변수 생성자");
		this.num1 = num1;
	}
	public Parent(int num1, int num2) {
		System.out.println("[Parent] : num1, num2 매개변수 생성자");
		this.num1 = num1;
		this.num2 = num2;
	}
}

// super():상위 클래스 생성자 호출
// 기본 생성자 : super()
// 인자가 있는 생성자 : super(x)
// → 초기화 및 생성 작업 수행
 
class Child extends Parent{
	
	int num3;
	public Child() {
		//super() 		//생량
		System.out.println("[Child] : Defalut 생성자");
	}
	public Child(int num1) {
		super(num1);
		System.out.println("[Child] : num1 생성자");
	}
	public Child(int num1, int num2) {
		super(num1, num2);
		System.out.println("[Child] : num1, num2 생성자");
	}
	public Child(int num1, int num2, int num3) {
		super(num1, num2);
		this.num3 = num3;
		System.out.println("[Child] : num1, num2, num3 생성자");
	}
}

public class C01InheritanceMain {
	public static void main(String[]args) {
		Child son = new Child();
		
		Child son1 = new Child(100);
		
		Child son2 = new Child(100,200);
		
		Child son3 = new Child(100,200,300);
	}
}