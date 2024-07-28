package changetype;

public class Changetype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형변환:다른 자료형으로 변환하는 것
		// 묵시적 형변환- 자동 형 변환

		byte bNum =10;
		int iNum = bNum;
		System.out.println(bNum);
		System.out.println(iNum);
			
		int iNum2 = 20;
		float fNum = iNum2;
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
		// 묵시적 형 변환- 강제 형 변환
		
		double dNum1 = 1.2;
		float fNum2= 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
