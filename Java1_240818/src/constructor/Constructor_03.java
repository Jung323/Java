package constructor;

public class Constructor_03 {
	String name;
	int age;
	
	Constructor_03(String n, int a){
		name = n;
		age = a;
	}
	void introduce() {
		System.out.println("안녕하세요. 저는 "+age+"세 "+name+"입니다.");
	}
	
}
