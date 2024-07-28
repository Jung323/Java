package operator;

public class Operator7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼항 연산자
		//조건 연산자
		int x =(5>3)? 10:20;
		System.out.println(x);
		
		int y = (7>1)? 5:15;
		System.out.println(y);
		
		int z =(9==15)? 8:18;
		System.out.println(z);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch=(fatherAge>motherAge)? 'T':'F';
		System.out.println(ch);
	}

}
