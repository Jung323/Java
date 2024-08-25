package constructor;

public class Constructor_04 {
	
	String name;
	int number;
	int score;
	
	Constructor_04(String a, int b, int c){
		name = a;
		number = b;
		score = c;
	}
	
	void student() {
		System.out.println("이름이 "+name+"인 학생은 번호가 "+number+"이고 성적은 "+score+"입니다.");
	}
}
