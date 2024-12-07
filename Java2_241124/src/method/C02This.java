package method;
// ## this()
// OverLoading(오버로딩)된 다른 생성자 호출 가능

class C02Simple{
	int x;
	int y;
	public C02Simple() {
//		x=10;
//		y=20;
		this (10,20); //이 코드로 위에 두 줄을 대체
		System.out.println("Default Constructor");
	}
	public C02Simple(int x) {
//		this.x = x;
//		y=20;
		this(x,20); //이 코드로 위에 두 줄을 대체
		System.out.println("Parameter(int x) Constructor");
	}
	public C02Simple(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Parameter(int x, int y) Constructor");
	}
}

public class C02This {
	public static void main(String[] args) {
		C02Simple obj = new C02Simple();
		C02Simple obj1 = new C02Simple(10);
		C02Simple obj2 = new C02Simple(10,20);
	}
}
