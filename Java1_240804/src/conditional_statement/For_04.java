package conditional_statement;

public class For_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//약수구하기
		for(int i=2;i<=30;i++) {
			System.out.print(i+"의 약수:");
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		
		//방정식의 해 구하기
		//2x+4y=10의 모든 해 구하기
		for (int x=0;x<11;x++) {
			for (int y=0;y<11;y++) {
				if(2*x+4*y==10) {
					System.out.println("x=" + x +",y=" + y);
				}
			}
		}
		
		
		
	}
}
