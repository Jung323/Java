package class_;

public class Class_10 {
	public int score(int[] scores) {
		int result = 0;
		for(int i=0;i<scores.length;i++) {
			result += scores[i];
		}
		return result;
	}
}
