package class_;

public class MainClass_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] studentA = {97,53};
		int[] studentB = {95,66};
		
		Class_10 mid = new Class_10(); //객체 생성
		int sumA = mid.score(studentA); //메서드를 호출한 결과 값을 sumA에 저장
		int sumB = mid.score(studentB); //메서드를 호출한 결과 값을 sumB에 저장
		
		if(sumA>sumB) {
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		}
		else if(sumA<sumB) {
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");	
		}
		else {
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
	}

}
