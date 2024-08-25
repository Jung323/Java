package constructor;

public class Constructor_08 {
	String name;
	String password;
	int balance;
	
	Constructor_08(String n, String p, int b){
		name = n;
		password = p;
		balance = b;
	}
	
	void deposit(int money) {
		balance += money;
	}
	void withDraw(int money) {
		balance -= money;
	}
	
	public int getBalance() {
		return balance;
	}
}
