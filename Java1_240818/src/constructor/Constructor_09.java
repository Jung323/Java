package constructor;

public class Constructor_09 {
	// TODO Auto-generated method stub
	//this.필드 = 매개변수명;
	//인스턴스가 바로 자기 자신을 참조하는데 사용하는 변수
	
	/*예를 들어 
	phone(String a, int b, int c){
		name = a;
		number = b;
		price = c;
	}
	라고하면 a,b,c가 무엇을 뜻하는지 이해하기 어려울 수 있음
	
	phone(String name, int number, int price){
		this.name = name;
		this.number = number;
		this.price = price;
	}
	같은 변수명을 사용하더라도 필드인지 매개변수인지 구분지어줌
	*/
	
	//this()
	//같은 클래스 안에 있는 생성자들 중 매개변수의 개수 / 자료형 / 순서에 맞는 다른 생성자를 호출하는 메서드
	//this(매개변수1,매개변수2''')
	/*
	phone(String name, int number){
		this.name = name;
		this.number = number;
	}
	
	굳이 반복되는 코드를 두번할 필요없이 this()를 이용해 위의 메소드를 가져올 수 있음
	phone(String name, int number, int price){
		this(name,number)
		this.price = price;
	}
	*/
	
	String brand;
	int year;
	int size;
	
	Constructor_09(String brand,int year, int size){
		this.brand = brand;
		this.year=year;
		this.size=size;
	}
	
	void show() {
		System.out.println(brand+"에서 만든 "+year+"년형 "+size+"인치 TV");
	}
	
}
