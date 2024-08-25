package class_;

public class Class_11 {
	void take(int m) {
		//return이 나올 때까지 반복
		
		while(true) {
			if (m<3000) {
				System.out.println("교통카드를 충전하러 갑니다.");
				return;
			}
			System.out.println("버스를 탑니다.");
			m -= 1250;
		}
	}
}
