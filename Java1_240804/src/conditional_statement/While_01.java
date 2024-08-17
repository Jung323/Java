package conditional_statement;

public class While_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문
		
		/*
		while(조건식) {
			실행문;
		}
		*/
		
		int sum=0;
		int i=1;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("합:"+sum);
		
		int k=1;
		while(k<=4) {
			System.out.println("while문 실행중입니다.");
			k++;
		}
	}

}
