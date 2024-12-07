package method;

class C01Person{
	String name;
	int age = 0;
	String address;
	
	void setPerson(String a) {
		name = a;
	}
	void setPerson(String a,int b) {
		name = a;
		age = b;
	}
	void setPerson(String a,int b,String c) {
		name = a;
		age = b;
		address = c;
	}
	void ShowInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		System.out.println("주소: "+ address);
	}
	
}


public class C01PracPersonMain {
	public static void main(String[] args) {
		C01Person obj = new C01Person();
		obj.setPerson("홍길동"); // 멤버변수 name에 "홍길동"저장
		obj.ShowInfo(); // 이름: 홍길동
						// 나이: 0 
						// 주소: null
		
		obj.setPerson("서길동",10);
		obj.ShowInfo();
		
		obj.setPerson("강호동",55,"서울");
		obj.ShowInfo();
	}
}
