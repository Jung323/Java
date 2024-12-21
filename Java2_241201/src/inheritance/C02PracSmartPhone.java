package inheritance;
//부모 클래스 : SmartPhone
//속성
//인치(사이즈)
//배터리 용량

class SmartPhone {
	int inch;
	int capacity;
	public SmartPhone(int inch,int capacity) {
		this.inch = inch;
		this.capacity = capacity;
	}
}
 
//-------------------------------------
//자식 클래스 : SmartPhoneWithCamera

//속성
//카메라 해상도(메가픽셀)

//기능
//PrintDetails(): 스마트폰의 속성 정보 출력

class SmartPhoneWithCamera extends SmartPhone{
	int resolution;
	public SmartPhoneWithCamera(int inch, int capacity, int resolution) {
		super(inch,capacity);
		this.resolution = resolution;
	}
	void printDetails() {
		System.out.println("[결과값]");
		System.out.println(inch + "인치");
		System.out.println(capacity+ "mAh");
		System.out.println(resolution+ "MP");
	}
}
public class C02PracSmartPhone {
	public static void main(String[] args) {
		//smartphonewithcamera 객체 생성
		//인치, 배터용량, 카메라 해상도를 인수로 가짐
		SmartPhoneWithCamera myPhone = new SmartPhoneWithCamera(6,4000,100);

		myPhone.printDetails();
		// [결과값]
		// 6인치
		// 4000mAh
		// 100MP
	}
}
