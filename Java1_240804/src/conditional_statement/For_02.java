package conditional_statement;

public class For_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단 출력해보기
		System.out.println("2단 외우기");
		int k=2;
		int dan;
		for (dan=1;dan<=9;dan++) {
			System.out.println(k+"*"+dan+"="+k*dan);
		}
		

		int m,n;
		for (m=2;m<10;m++) {
			System.out.println("--------"+m+"단 외우기----------");
			for(n=1;n<10;n++) {
				System.out.println(m+"*"+n+"="+m*n);
			}
		}
	}

}
