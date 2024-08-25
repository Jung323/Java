package constructor;

public class Constructor_07 {
	String name;
	int number;
	int ko_score;
	int en_score;
	int ma_score;
	double total_score;
	double avg_score;
	
	Constructor_07(String n,int num,int ko,int en,int ma){
		number=num;
		ko_score=ko;
		en_score=en;
		ma_score=ma;
		
		total_score=ko+en+ma;
		avg_score=total_score/3;
		System.out.println("-------"+n+"--------");
		System.out.printf("%.2f\n",total_score);
		System.out.printf("%.2f\n",avg_score);
	}
	
}
