package conditional_statement;


public class For_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문(lteration statement)
		//프로그램 코드 내에서 똑같은 명령을 반복하여 수행하도록 제어하는 명령문
		
		//for문
		/*
		for(초기화식;조건식;증감식) {
			실행문;
		}
		*/
		
		
		int num;
		for (num=1;num<=5;num++) {
			System.out.println(num);
		}
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("합:"+sum);
		
		
		//1부터 100까지 수 중에서 짝수의 합
		int total = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				total+=i;
			}
		}
		System.out.println("합:"+total);
		
		
		//100부터 1까지 숫자나열
		for(int i=100;i>=1;i--) {
			System.out.println(i);
		}
		
		
		//21부터 57까지의 수 중 홀수만 출력
		for (int odd=21;odd<=57;odd++) {
			if(odd%2==1) {
				System.out.println(odd);
			}
		}
		for (int odd=21;odd<=57;odd+=2) {
			System.out.println(odd);
		}
	}

	
}
