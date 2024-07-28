package operator;

public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//복합 대입 연산자
		
		int x = 9;
		x += 1;
		System.out.println(x);
		
		int result = 0;
		
		result += 10;
		System.out.println("result="+result);
		
		result -= 5;
		System.out.println("result="+result);
		
		result *= 3;
		System.out.println("result="+result);
		
		result /= 5;
		System.out.println("result="+result);

		result %= 3;
		System.out.println("result="+result);
	}

}
