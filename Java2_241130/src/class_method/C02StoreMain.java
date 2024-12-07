package class_method;


class Customer{
	// 속성
	// 보유금액
	int myMoney;
	// 콜라보유개수
	int ColaCnt;
	
	// 매개변수 생성자
	public Customer(int myMoney, int colaCnt) {
		this.myMoney = myMoney;
		ColaCnt = colaCnt;
	}
	
	// 기능
	// 구매하기
	// 어느 편의점에서 얼마치를 살지 
	public void pay(Store obj, int money) {
		// 1.내 보유 금액에서 Money 차감
		if(myMoney >= money) {
			myMoney -= money;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		
		// 2. 지정된 편의점에 money를 전달
		int cnt = obj.returnCola(money);
		
		// 3. 내 콜라
		ColaCnt += cnt;
	}

	public void ShowInfo() {
		System.out.println("손님의 정보 출력");
		System.out.println("콜라 개수: "+ ColaCnt);
		System.out.println("보유 금액: "+ myMoney);
		System.out.println();
	}
	
	
}


class Store{
	// 보유금액
	int savedMoney;
	// 콜라 보유량
	int colaCnt;
	// 콜라 가격
	int price;
	
	public Store(int savedMoney, int colaCnt, int price) {
		this.savedMoney = savedMoney;
		this.colaCnt = colaCnt;
		this.price = price;
		
	}
	
	
	public int returnCola(int money) {
		// 1. 돈통(savedMoney)에 받은 금액(Money)를 더해줘야 함.
		savedMoney += money;
		
		// 2. 콜라 개수를 세기
		int cnt = money / price;
		
		// 3. 콜라 보유량에서 콜라 개수만큼 빼기
		colaCnt -= cnt;
		
		// 4. 손님에 콜라 주기
		return cnt;
	}

	public void ShowInfo() {
		System.out.println("편의점의 정보 출력");
		System.out.println("콜라 개수: "+ colaCnt);
		System.out.println("보유 금액: "+ savedMoney);
		
		System.out.println();
	}
	
	
}

public class C02StoreMain {
	public static void main(String[] args) {
		// 고객 객체
		Customer dong = new Customer(100000, 0);
		Customer gom = new Customer(5000,1);
		
		// 편의점 객체
		Store GS반월 = new Store(100000, 100, 1000);
		Store E24중앙로 = new Store(200000, 50, 1200);
		
		dong.ShowInfo();
		GS반월.ShowInfo();
		
		dong.pay(GS반월, 5000);
		
		dong.ShowInfo();
		GS반월.ShowInfo();
	}
}
