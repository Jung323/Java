package constructor;


// 프로그램은 sum 메소드를 통해 주어진 숫자들에 대한 홀수와 짝수의 합을 계산하고. 그 결과를 출력하는 간단한 프로그램입니다.
// sum 메소드를 호출하여 인수로 20,21,12,111을 전달하고 반환값을 변수에 저장 후 결과를 출력

// [결과값]
// 짝수의 합: 32
// 홀수의 합: 132
// result = 164


public class C03PracOddEven {
	int Sum_Odd = 0;
	int Sum_Even = 0;	
	
	
	public int sum(int a,int b,int c,int d) {
		int Sum_Odd = 0;
		int Sum_Even = 0;
		
		if (a%2==0) {
			Sum_Even += a;
		} else {
			Sum_Odd +=a;
		}
		
		if (b%2==0) {
			Sum_Even += b;
		} else {
			Sum_Odd +=b;
		}
		
		if (c%2==0) {
			Sum_Even += c;
		} else {
			Sum_Odd +=c;
		}
		
		if (d%2==0) {
			Sum_Even += d;
		} else {
			Sum_Odd +=d;
		}
		

		System.out.println("짝수의 합 : "+ Sum_Odd);
		System.out.println("홀수의 합 : "+ Sum_Even);
		
		return a+b+c+d;
	}
	
	
	public static void main(String[] args) {
		

		C03PracOddEven obj = new C03PracOddEven();
		
		int result = obj.sum(20,21,12,111);
		
		System.out.println("result = "+ result);
	}
	
}
