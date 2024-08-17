package conditional_statement;

public class Do_while_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//do-while문
		//무조건 실행문을 한번 실행 후 조건에 따라 실행문 실행
		
		/*
		do {
			실행문;
		}while(조건식);
		*/
		
		int sum=0;
		int i=1;
		do {
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println("합:"+sum);
		
		
	}

}
