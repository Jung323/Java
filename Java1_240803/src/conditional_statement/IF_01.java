package conditional_statement;


public class IF_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문(Control statement) 
		//프로그램은 어떤 작업을 특정 조건에 맞게 수행하거나 반복하도록 제어할 수 있다
		
		//조건문(Conditional statement)
		//주어진 조건에 따라 다른 문장을 선택할 수 있도록 프로그래밍하는 것
		//if문/swithch문
		
		//if문의 형식
		/*
		if(조건식){
		수행문;
		}
		*/
		
		
		//예제 1
		int age = 8;
		if(age>=8) {
			System.out.println("학교에 다닙니다.");
		}
		
		
		//예제 2
		int result = 0;
		if (3>2) {
			result =3;
		}
		System.out.println(result);

	
		//예제 3
		int hyunsu_age = 21;
		if (hyunsu_age>=20) {
			System.out.println("현수는 성인입니다.");
		}
	
	}

}
