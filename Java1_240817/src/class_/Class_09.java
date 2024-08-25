package class_;

public class Class_09 {
	//반환값이 없는 경우
	void sum(int[]nums) {
		int result = 0;
		for (int i=0;i<nums.length;i++) {
			result += nums[i];
		}
		System.out.println("숫자들의 합은 "+result+"입니다.");
	}
	
	//반환값이 있는 경우
	public int sum2(int[]nums2) {
		int result2 = 0;
		for (int k=0;k<nums2.length;k++) {
			result2 += nums2[k];
		}
		return result2;
	}
}
