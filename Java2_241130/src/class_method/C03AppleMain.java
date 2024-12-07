package class_method;

class Seller{
	int sellermoney;
	int sellercnt;
	int sellerprice;
	
	public Seller(int sellermoney,int sellercnt, int sellerprice) {
		this.sellermoney = sellermoney;
		this.sellercnt = sellercnt;
		this.sellerprice = sellerprice;
		
		//1번 코드일 때
//		System.out.println("seller의 정보 출력");
//		System.out.println("seller의 사과 개수: "+ sellercnt);
//		System.out.println("seller의 보유 금액: "+sellermoney);
//		System.out.println();
	}
	
	public int returnapple(int money) {
		sellermoney += money;
		int cnt = money / sellerprice;
		sellercnt -= cnt;
		return cnt;
	}
	//2번 코드일 때
	public void ShowInfo() {
		System.out.println("seller의 정보 출력");
		System.out.println("seller의 사과 개수: "+ sellercnt);
		System.out.println("seller의 보유 금액: "+sellermoney);
		System.out.println();
	}
	
}

class Buyer{
	int buyermoney;
	int buyercnt;
	
	public Buyer(int buyermoney, int buyercnt) {
		this.buyermoney = buyermoney;
		this.buyercnt = buyercnt;
		
		//1번 코드일 때
//		System.out.println("buyer의 정보 출력");
//		System.out.println("buyer의 사과 개수: "+ buyercnt);
//		System.out.println("buyer의 보유 금액: "+ buyermoney);
//		System.out.println();
	}
	
	public void pay(Seller apple, int money) {
		if (buyermoney>= money) {
			buyermoney -= money;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		int cnt = apple.returnapple(money);
	
		buyercnt += cnt;
	}
	//2번 코드일 때
	public void ShowInfo() {
		System.out.println("buyer의 정보 출력");
		System.out.println("buyer의 사과 개수: "+ buyercnt);
		System.out.println("buyer의 보유 금액: "+buyermoney);
		System.out.println();
	}
}




public class C03AppleMain {
	public static void main(String[] args) {
		// 판매자 객체 생성
		Seller seller = new Seller(10000, 100, 1000);
		// 소비자 객체 생성
		Buyer buyer = new Buyer(5000,0);
		
		// 소비자가 판매자에게 2000원 어치 사과를 사는 과정
		buyer.pay(seller, 2000);
		
		// 판매자 정보 확인
		
		//1번 코드일 때
//		System.out.println(seller);
		
		//2번 코드일 때
		seller.ShowInfo(); // 보유금액, 사과개수 출력
		
		
		// 소비자 정보 확인
		//1번 코드일 때
//		System.out.println(buyer);

		//2번 코드일 때
		buyer.ShowInfo();
	}
}
