package conditional_statement;

public class Continue_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				continue;
			}
			sum +=i;
		}
		System.out.println("짝수 합: "+sum);
		
	}

}
