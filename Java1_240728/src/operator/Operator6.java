package operator;

public class Operator6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리 연산자
		// 논리곱(AND) : && or & 
		// 논리합(OR) : || or |
		// 배타적 논리합(XOR) : ^
		// 부정(NOT) : !
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("--논리곱--");
		//둘다 true이면 true
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b1 && b4);
		
		System.out.println("--논리합--");
		//둘중 하나라도 true이면 true
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b4);
		
		System.out.println("--배타적 논리합--");
		//둘의 값이 다르면 true, 같으면 false
		System.out.println(b1^b2);
		System.out.println(b1^b3);
		
		
		int num1 = 10;
		int i = 2 ;
		
		boolean value = ((num1 = num1 + 10)<10) && ((i = i + 2)< 10);
		System.out.println(value);//false
		System.out.println(num1);//20
		System.out.println(i); //2 : &&앞부분이 false라서 무조건 false니까 뒤에를 실행하지 않음
		
		value = ((num1 = num1 + 10)>10) || ((i=i+2)<10);
		System.out.println(value); //true
		System.out.println(num1); //30
		System.out.println(i); //2 : ||앞부분이 true라서 무조건 true니까 뒤에를 실행하지 않음

		//이렇게 앞부분만으로 판단하고 뒤에를 실행하지 않아도 되면 단락 회로 평가라고 함
	}

}
