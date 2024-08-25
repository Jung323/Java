package constructor;

public class Constructor_06 {
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	//생성자1, 기본생성자
	Constructor_06(){
		
	}
	
	//생성자2, 매개변수1
	Constructor_06(String t){	
		title = t;
	}
	
	//생성자3, 매개변수2
	Constructor_06(String t,int p){	
		title = t;
		page = p;
	}
	
	//생성자4, 매개변수2
	Constructor_06(int s, String t){	
		series = s;
		title = t;
	}
}
