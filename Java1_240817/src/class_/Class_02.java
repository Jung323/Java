package class_;

public class Class_02 {
	public String order_number;
	public String id;
	public String date;
	public String name;
	public String item_number;
	public String address;
	
	public void order() {
		System.out.println("주문번호: "+order_number);
		System.out.println("아이디: "+id);
		System.out.println("주문 날짜: "+date);
		System.out.println("주문자 이름: "+name);
		System.out.println("상품번호: "+item_number);
		System.out.println("배송 주소: "+address);
	}
}
