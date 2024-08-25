package class_;

public class MainClass_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_05 stu1 = new Class_05();
		stu1.studentName="김고이";
		stu1.hello();
		System.out.println("학교는 "+Class_05.schoolName+"입니다.");
		Class_05.goToShool();
		
		Class_05 stu2 = new Class_05();
		stu2.studentName="김고삼";
		stu2.hello();
		System.out.println("학교는 "+Class_05.schoolName+"입니다.");
		Class_05.goToShool();
	}

}
