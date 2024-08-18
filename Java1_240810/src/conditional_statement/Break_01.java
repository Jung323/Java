package conditional_statement;

public class Break_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//break문
		//반복문을 더이상 수행하지 않고 빠져나올 떄 사용
		for (int index=1;index<=5;index++) {
			if(index==3) {
				break;
			}
			System.out.println(index);
		}
		
		
		//구구단 2단부터 9단까지 중에 두 숫자를 곱한 갑이 25이상일 때 구구단을 종료하는 소스코드
		
		for (int i=2;i<=9;i++) {
			System.out.println("---------------");
			for (int j=1;j<=9;j++) {
				if(i*j>=25) {
					break;
				}

				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		
	}

}
