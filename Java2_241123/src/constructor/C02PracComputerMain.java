package constructor;
// 문제2: 컴퓨터 클래스 만들기

// 1. Computer 클래스를 완성하세요
// 2. 속성 : 이름, 시리얼넘버, CPU, RAM, DISK
// 3. 기능 : PowerOn() : EX) MacOs 1010의 전원을 켭니다.
//
//			PowerOff() : EX) 갤럭시북5 2001의 전원을 끕니다.
//
//			ShowInfo() : EX) 제품명 : MacOs
//							시리얼 넘버: 1010
//							CPUSpec: M1
//							RAMSpec : 16GB
//							DISKSpec : 1TB
//
// 4. Main메서드 완성하기
//		4-1) 컴퓨터 클래스의 객체 만들기
//		4-2) 객체 초기화
//		4-3) 전원 켜기
//		4-4) 정보 출력하기
//		4-5) 전원 끄기

public class C02PracComputerMain {
	String name;
	int Serial_number;
	String CPUSpec;
	int RAMSpec;
	int DISKSpec;
	
	
	public C02PracComputerMain(String a, int b, String c, int d, int e) {
		name =a;
		Serial_number = b;
		CPUSpec = c;
		RAMSpec = d;
		DISKSpec = e;
		
	}
	
	public void PowerOn() {
		System.out.println(name+" "+Serial_number+"의 전원을 켭니다.");
	}
	
	public void PowerOff() {
		System.out.println(name+" "+Serial_number+"의 전원을 끕니다.");
	}
	
	public void ShowInfo() {
		System.out.println("제품명 : "+ name);
		System.out.println("시리얼넘버 : "+ Serial_number);
		System.out.println("CPUSpec : " + CPUSpec);
		System.out.println("RAMSpec : "+ RAMSpec +"GB");
		System.out.println("DISKSpec : "+ DISKSpec +"TB");
	}
	
	
	public static void main(String[] args) {
		C02PracComputerMain ComputerMain01 = new C02PracComputerMain("MacOs",1010,"M1",16,1);
		ComputerMain01.PowerOn();
		ComputerMain01.ShowInfo();
		ComputerMain01.PowerOff();
	}
	
}
