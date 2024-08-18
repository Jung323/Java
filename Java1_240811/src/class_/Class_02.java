package class_;

public class Class_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store(); //생성자입니다. 출력
		store.name = "가게1";
		store.item = "상품1";
		store.totalMoney = 1000;
		System.out.println("store.name= "+store.name);
		System.out.println("store.item= "+store.item);
		System.out.println("store.totalMoney= "+store.totalMoney);

		store.buy(); //메서드입니다. 출력
	}

}
