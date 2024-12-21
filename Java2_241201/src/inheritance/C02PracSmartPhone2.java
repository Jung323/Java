package inheritance;

//부모 클래스 : SmartPhone
//속성
//인치(사이즈)
//배터리 용량

class SmartPhone2 {
	int inch;
	int capacity;
	public SmartPhone2(int inch,int capacity) {
		this.inch = inch;
		this.capacity = capacity;
	}
	
	
	public int getInch() {
		return inch;
	}
	public int getcapacity() {
		return capacity;
	}
	
}

//-------------------------------------
//자식 클래스 : SmartPhoneWithCamera

//속성
//카메라 해상도(메가픽셀)

//기능
//PrintDetails(): 스마트폰의 속성 정보 출력

class SmartPhoneWithCamera2 extends SmartPhone2{
	int resolution;
	public SmartPhoneWithCamera2(int inch, int capacity, int resolution) {
		super(inch,capacity);
		this.resolution = resolution;
	}
	void printDetails() {
		System.out.println("[결과값]");
		System.out.println(getInch() + "인치");
		System.out.println(getcapacity()+ "mAh");
		System.out.println(resolution+ "MP");
	}
}

public class C02PracSmartPhone2 {
	public static void main(String[] args) {
		//smartphonewithcamera 객체 생성
		//인치, 배터용량, 카메라 해상도를 인수로 가짐
		SmartPhoneWithCamera2 myPhone = new SmartPhoneWithCamera2(6,4000,100);

		myPhone.printDetails();
		// [결과값]
		// 6인치
		// 4000mAh
		// 100MP
	}
}