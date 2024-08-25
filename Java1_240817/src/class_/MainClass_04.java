package class_;

public class MainClass_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_04 father = new Class_04(); //객체 생성
		Class_04 son = new Class_04(); //객체 생성
		
		father.address = "인천";
		System.out.println(father.address);
		System.out.println(son.address);
		//father 객체의 주소만 변경됨
		//인스턴트(객체) 멤버: 각 객체가 가지게 되는 필드와 메서드
		
		
		//정적 멤버: 모든 객체들이 공유하며 사용하는 하나의 필드와 메서드
		//static이라는 키워드를 사용하면 정적 멤버로 사용가능 함
		//별도로 객체를 생성할 필요가 없음
		
		System.out.println(Class_04.schoolName);
		Class_04.goToSchool();
	}

}
