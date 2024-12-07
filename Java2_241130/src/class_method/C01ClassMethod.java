package class_method;

class Controller{
	MemberInfo member;
	
	void SetMember(MemberInfo member) {
		this.member = member;
	}
	MemberInfo getMember() {
		return member;
	}
}

class MemberInfo{
	String name;
	int age;
	String address;

	public MemberInfo(String name, int age, String address) {
		super();
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	
	// 객체의 정보를 반환해주는 역할
	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}


public class C01ClassMethod {
	public static void main(String[] args) {
		MemberInfo obj = new MemberInfo("홍길동", 55, "대구");
		System.out.println(obj.toString());
		
		Controller controller = new Controller();
		
		controller.SetMember(obj);
		MemberInfo tmp = controller.getMember();
		
		System.out.println(tmp.toString());
	}
}
