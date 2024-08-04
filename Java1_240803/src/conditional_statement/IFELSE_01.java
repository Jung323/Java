package conditional_statement;

public class IFELSE_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If-else문
		/*
		if(조건식) {
			수행문1;
		}
		else {
			수행문2;
		}
		*/
		
		
		//예제 1
		int age=7;
		if(age>=8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		//예제 2
		int num = 5;
		if (num>4) {
			System.out.println(num+ "은(는) 4보다 큽니다.");
		}
		else {
			System.out.println(num + "은(는) 4보다 작습니다.");
		}
		
		//예제 3
		int a = 4;
		int b = 10;
		if (a>b) {
			System.out.println("a가 b보다 큽니다.");
		}
		else {
			System.out.println("a가 b보다 작거나 같습니다.");
		}
		
		//예제 4
		char gender = 'F';
		if (gender == 'F') {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("남성입니다.");
		}
		
		//예제 5
		int x = 32;
		if (x>10 && x<20)
		{
			System.out.println("x는 10보다 크고 20보다 작습니다.");
		}
		else {
			System.out.println("x는 10보다 작거나 20보다 큽니다.");
		}
		
		//예제 6
		char ch = 'X';
		if (ch=='x' || ch =='X') {
			System.out.println("변수 ch는 x 또는 X입니다.");
		}
		else {
			System.out.println("ERROR");
		}
		
		//예제 7
		
	}

}
