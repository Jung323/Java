package practice;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int sum_sum=0;
		for (int i=1;i<=10;i++) {
			sum += i;
			sum_sum += sum;
			System.out.println("합:"+sum);
			System.out.println("전체합: "+sum_sum);
		}
		
	}

}
