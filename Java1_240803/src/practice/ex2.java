package practice;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 9;
		int fee;
		
		if (age<8) {
			fee = 1000;
		}
		else if(age<14) {
			fee = 2000;
		}
		else if(age<20) {
			fee = 2500;
		}
		else {
			fee = 3000;
		}
		System.out.println("9살 영희의 입장료는 "+fee+"입니다.");
	}

}
