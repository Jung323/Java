package conditional_statement;

public class For_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 for문
		
		int count = 0;
		for(int i=0;i<20;i++) {
			for(int j=0;j<10;j++) {
				count++;
			}
		}
		System.out.println("반복횟수: "+count);
		
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int m=1;m<=5;m++) {
			for (int n=1;n<=m;n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
}
