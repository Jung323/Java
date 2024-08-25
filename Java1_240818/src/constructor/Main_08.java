package constructor;

public class Main_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_08 Bank = new Constructor_08("홍길동","1234",7000);
		Bank.deposit(2000);
		Bank.withDraw(4500);
		System.out.println(Bank.name+"님의 계좌 잔액은 "+Bank.getBalance()+"원입니다.");
	}

}
