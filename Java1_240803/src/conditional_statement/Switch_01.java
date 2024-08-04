package conditional_statement;

public class Switch_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch문
		//break는 switch문을 완전히 빠져나가기 위한 장치
		/*
		switch (변수) {
			case 값1:수행문1;
				break;
			case 값2:수행문2;
				break;
			case 값3:수행문3;
				break;
			default:수행문4;
		}
		*/
		
		
		//예제 1
		int num = 7;
		switch (num) {
			case 1:
				System.out.println("num은 1입니다.");
				break;
			case 7:
				System.out.println("num은 7입니다.");
				break;
			default:
				System.out.println("num은 1도 아니고 7도 아닙니다.");
		}
		
		//예제 2
		int ranking =1;
		char medalColor;
		switch (ranking) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking+"등 메달의 색깔은 "+medalColor+"입니다.");
		
		
		
		//예제 3
		int food = 1;
		switch (food) {
		case 1:
			System.out.println("한식");
			break;
		case 2:
			System.out.println("일식");
			break;
		case 3:
			System.out.println("중식");
			break;
		default:
			System.out.println("양식");
		}
		
		//case문 동시 사용
		//예제 4
		int month=15;
		int day;
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			day = 31;
			break;
		case 4:case 6:case 9:case 11:
			day = 30;
			break;
		case 2: 
			day = 28;
			break;
		default:
			day = 0;

		}
		System.out.println(month+"월은 "+ day +"일까지 있습니다");
		
		//예제 5
		String medalcolor = "Bronze";
		switch(medalcolor) {
		case "Gold":
			System.out.println("금메달");
			break;
		case "Silver":
			System.out.println("은메달");
			break;
		case "Bronze":
			System.out.println("동메달");
			break;
		default:
			System.out.println("메달이 없습니다");
		}
		
	}

}
