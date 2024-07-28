package operator;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//예제 1
		int x = 2;
		int y = x*x*x + x*x - x -5;
		System.out.println(y);
		
		//예제 2
		int z = 49;
		z = -z;
		System.out.println(z);
		
		//예제 3
		int apple = 9580;
		int people = apple / 34;
		int remain = apple % 34;
		System.out.println("사람 수 : "+people);
		System.out.println("남는 사과 수 : "+remain);
		
		//예제 4
		int value = 839;
		int value2 = value - value % 100;
		System.out.println(value2);
	}

}
