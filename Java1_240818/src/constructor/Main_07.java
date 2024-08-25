package constructor;

public class Main_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_07 stu1 = new Constructor_07("김자바",10,63,90,100);
		Constructor_07 stu2 = new Constructor_07("김코딩",11,72,60,80);
		
		System.out.println("평균합:"+(stu1.avg_score+stu2.avg_score));

	}

}
