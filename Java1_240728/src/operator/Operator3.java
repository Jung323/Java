package operator;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이항 연산자
		//산술 연산자: + - * / %
		
		int x = 200;
		int y = 100;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		double x1 = 1.234;
		int x2 = 10;
		
		System.out.println(x1+x2); 
		//int x2가 더 큰 double형으로 묵시적 형변환(자동형변환)

	
		int orange = 4679;
		int box = orange / 63;
		int remain = orange % 63;
		System.out.printf("필요한 박스의 수: %d\n",box);
		System.out.printf("남는 귤의 수: %d\n",remain);
	}

}
