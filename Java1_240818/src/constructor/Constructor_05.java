package constructor;

public class Constructor_05 {
	//생성자 오버로딩
	//상황에 따라 매개변수 없이 또는 1개,2개 등 외부에서 제공할 수 있는 데이터만큼만
	//매개변수로 전달하여 객체를 생성할 수 있게 하는 방법
	//생성자를 다양한 형태로 선언하는 것
	
	String brand;
	int series;
	String color = "검정색"; //필드 기본값 초기화
	
	Constructor_05(String b, int s){
		//매개변수를 2개 받는 생성자
		brand =b;
		series =s;
	}
	Constructor_05(String b, int s,String c){
		//매개변수를 3개 받는 생성자
		brand =b;
		series =s;
		color =c;
	}
	void phoneInfo() {
		System.out.println(color+" "+brand+" "+series);
	}
}
