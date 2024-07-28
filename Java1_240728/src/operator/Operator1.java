package operator;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단항연산자
		//부호연산자
		
		int num = -78;
		System.out.println(num);
		num = -num;
		System.out.println(num);
		num = -num;
		System.out.println(num);
		
		//증감 연산자
		//++ : 1을 증가시키는 연산자로 +1과 같음
		//-- : 1을 감소시키는 연산자로 -1과 같음
		
		int a = 20;
		int b = ++a;
		System.out.println(b);
		System.out.println(a);
		
		int c = 30;
		int d = --c;
		System.out.println(d);
		
		int num2 = 40;
		System.out.println(++num2);
		System.out.println(num2);
		
		System.out.println(num2++);
		System.out.println(num2);
		
		
		int num3 = 55;
		System.out.println(--num3);
		System.out.println(num3);
		
		System.out.println(num3--);
		System.out.println(num3);
	}

}
