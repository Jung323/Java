package constructor;
// 문제 1. 사각형 클래스 만들기
//
// 1. Rectangle 클래스를 작성하세요.
// 2. width와 height라는 두 개의 속성(멤버 변수)을 가지도록 클래스를 구성하세요.
// 3. 생성자를 통해 width와 height를 초기화하세요.
// 4. getArea() 메소드를 구현하여 사각형의 넓이를 반환하세요.
// 5. getPerimeter() 메소드를 구현하여 사각형의 둘레를 반환하세요.


public class C02PracRectangle {

	double width;
	double height;
	
	public C02PracRectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double Area = width*height;
		return Area;
	}
	
	public double getPerimeter() {
		double Perimeter = (width+height)*2;
		return Perimeter;
	}
	
	public static void main(String[] args) {
		C02PracRectangle myRectangle = new C02PracRectangle(5.0, 3.0);
		System.out.println("넓이: " + myRectangle.getArea());
		System.out.println("둘레: " + myRectangle.getPerimeter());

				
	}
	
 }
