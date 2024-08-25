package constructor;

public class Constructor_10 {
	String title;
	String artist;
	int year;
	String country;
	
	Constructor_10(String title,String artist,int year,String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	void show() {
		System.out.println(year+"년 "+country+"의 "+artist+"가 부른 "+title);
	}
}
