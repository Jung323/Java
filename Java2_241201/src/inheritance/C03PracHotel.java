package inheritance;
//부모 클래스: 호텔(Hotel)

class Hotel{
	String name;
	String location;
	public Hotel(String name,String location) {
		this.name = name;
		this.location = location;
	}

}



class LuxuryHotel extends Hotel{
	int score;
	public LuxuryHotel(String name, String location,int score) {
		super(name,location);
		this.score = score;
	}

}

class ThemeHotel extends Hotel{
	String theme;
	public ThemeHotel(String name, String location, String theme) {
		super(name,location);
		this.theme = theme;
	}

}


public class C03PracHotel {
	public static void ShowInfo(Hotel hotel) {
		//자동 업캐스팅 발생				
		//Hotel hotel = lxH;
		//Hotel hotel = tmH;
		
		
		//자식클래스 내용을 사용하기 위해 다운캐스팅
		if (hotel instanceof LuxuryHotel) {
			LuxuryHotel down = (LuxuryHotel) hotel;
			
			System.out.println("=== 럭셔리 호텔 정보 ===");
			System.out.println("호텔 이름 : "+down.name);
			System.out.println("위치: "+down.location);
			System.out.println("별점: "+down.score+" stars");
		}else if (hotel instanceof ThemeHotel) {
			ThemeHotel down = (ThemeHotel) hotel;
			
			System.out.println("=== 테마 호텔 정보 ===");
			System.out.println("호텔 이름 : "+down.name);
			System.out.println("위치: "+down.location);
			System.out.println("테마: "+down.theme);
		}
		
		
	}

	public static void main(String[] args) {
		//럭셔리 호텔 객체 생성
		LuxuryHotel lxH = new LuxuryHotel("힐튼","서울",5);

		//테마 호텔 객체 생성
		ThemeHotel tmH = new ThemeHotel("디즈니 호텔", "파리","디즈니 캐릭터 테마");
		
		ShowInfo(lxH);
		System.out.println();
		ShowInfo(tmH);
	}	
}
	
  
	
	//[결과값]
	// === 럭셔리 호텔 정보 ===
	// 호텔 이름 : 힐튼
	// 위치 : 서울
	// 별점 : 5 stars

	// == 테마 호텔 정보 ==
	// 호텔 이름 : 디즈니 호텔
	// 위치 : 파리
	// 테마 : 디즈니 캐릭터 테마