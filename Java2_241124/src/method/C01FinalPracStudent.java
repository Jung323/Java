package method;
//다음과 같은 요구사항에 맞는 클래스를 작성하세요.
//1. student 클래스를 생성하세요
//학생의 이름(name)
//학번(studentId)
//학점(grade)

//2. 디폴트 생성자를 포함하여, 이름과 학번을 받는 매개변수 생성자를 작성하세요.

//3. 학생의 학점을 계산하는 메서드 calculateGrade 추가하세요. 
//90 이상: A
//80 이상 90 미만: B
//70 이상 80 미만: C
//60 이상 70 미만: D
//60 미만: F

//4. 학생의 정보를 보여주는 displayInfo 메서드를 추가하세요.

//5. 객체를 생성한 후, 객체의 정보와 학점을 출력하는 테스트 코드를 작성하세요.


class student{
	String name;
	int studentId;
	String grade;
	int examScore;
	
	public student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	 void calculateGrade(int examScore) {
		if (examScore>=90) {
			this.grade = "A";
		}
		else if (examScore>=80 & examScore<90) {
			this.grade = "B";
		}
		else if (examScore>=70 & examScore<80) {
			this.grade = "C";
		}
		else if (examScore>=60 & examScore<70) {
			this.grade = "D";
		}
		else {
			this.grade = "F";
		}
	}
	
	void displayInfo() {
		System.out.println("학생정보");
		System.out.println("학생 이름: "+name);
		System.out.println("학생 학번: "+studentId);
		System.out.println("학생 학점: "+grade);
	}
	
}


public class C01FinalPracStudent {
	
	
	public static void main(String[] args) {
		//학생 객체 생성
		student student1 = new student("홍길동",20212001);
		
		//시험 점수 부여
		int examScore = 85;
		
		//학점 계산
		student1.calculateGrade(examScore);
		
		//정보 출력
		student1.displayInfo();
	}
}
