package constructor;

public class Main_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_06 Book1 = new Constructor_06();
		System.out.println("Book1.title: "+Book1.title);
		System.out.println("Book1.series: "+Book1.series);
		System.out.println("Book1.page: "+Book1.page);
		System.out.println();
		
		Constructor_06 Book2 = new Constructor_06("자바");
		System.out.println("Book2.title: "+Book2.title);
		System.out.println("Book2.series: "+Book2.series);
		System.out.println("Book2.page: "+Book2.page);
		System.out.println();
		
		Constructor_06 Book3 = new Constructor_06("신데렐라",170);
		System.out.println("Book3.title: "+Book3.title);
		System.out.println("Book3.series: "+Book3.series);
		System.out.println("Book3.page: "+Book3.page);
		System.out.println();
		
		Constructor_06 Book4 = new Constructor_06(5,"노인과 바다");
		System.out.println("Book4.title: "+Book4.title);
		System.out.println("Book4.series: "+Book4.series);
		System.out.println("Book4.page: "+Book4.page);
		
	}

}
