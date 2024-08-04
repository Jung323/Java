package conditional_statement;

public class IFELSE_IF_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if-else if문
		/*
		if (조건식1) {
			수행문1;
		}
		else if (조건식2) {
			수행문2;
		}
		else if (조건식3) {
			수행문3;
		}
		else {
			수행문4;
		}
		*/
	
		//예제 1
		int favorite = 7;
		if (favorite<5) {
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		}
		else if (favorite>5) {
			System.out.println("좋아하는 숫자는 5보다 큽니다.");
		}
		else {
			System.out.println("좋아하는 숫자가 5입니다.");
		}
	
		
		//예제 2
		int score = 85;
		char grade;
		if (score>=90) {
			grade='A';
		}
		else if (score>=80) {
			grade='B';
		}
		else if (score>=70) {
			grade='C';
		}
		else {
			grade='D';
		}
		System.out.println(grade+"학점 입니다.");
		
		//예제 3
		int month = 9;
		String season;
		if (month>=3 && month <6) {
			season = "봄";
		}
		else if (month>=6 && month <9) {
			season = "여름";
		}
		else if (month>=9 && month <11) {
			season = "가을";
		}
		else if (month==12 ||(month>=1 && month <3)) {
			season = "겨울";
		}
		else {
			season = "올바르지 않은 월";
		}
		System.out.println(season+"입니다.");
		
		
		//예제 4
		int age = 22;
		if (age>=20 && age<30) {
			System.out.println("20대");
		}
		else if(age<=10) {
			System.out.println("10대 이하");
		}
		else {
			System.out.println("30대 이상");
		}
		
		
	
	}

	
}
