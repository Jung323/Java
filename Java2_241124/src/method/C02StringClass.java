package method;

import java.util.Scanner;

public class C02StringClass {
	public static void main(String[] args) {
	
	int alength, blength;
	char achar, bchar;
	String str1 = new String("jave Powerful");
	String str2 = new String("java Programming");
	String str3 = str1+str2;
	
	System.out.println(str3);
	
	alength = str1.length();
	blength = str2.length();
	achar = str1.charAt(5);
	bchar = str2.charAt(10);
	
	System.out.println("str1에 저장= "+str1+" 길이 = "+alength);
	System.out.println("str2에 저장= "+str2+" 길이 = "+blength);
	System.out.println("str1의 5번쨰 문자= "+achar);
	System.out.println("str2의 10번쨰 문자= "+bchar);
	System.out.println("str1을 대문자로 변환: "+str1.toUpperCase());
	System.out.println("str2의 a를 A로 변환: "+str2.replace("a","A"));
	System.out.println("-------------------------------------------");

	
	//trim
	Scanner sc = new Scanner(System.in);
	String tmp = sc.nextLine();
	
	System.out.println(tmp);
	System.out.println(tmp.trim());
	
	//substring(): 문자열 자르기
	System.out.println(tmp.substring(2)); //시작값을 적어주는 것, 2부터 출력
	System.out.println(tmp.substring(0,2)); //0부터 2 전까지 출력
	
	//indexOf('문자열'): 문자열의 index번호 확인
	System.out.println(tmp.indexOf("H")); //H가 없으면 -1을 return
	
	//lastIndexOf('문자열'): 문자열의 index번호 확인
	System.out.println(tmp.lastIndexOf("H")); //뒤에서부터 앞으로 검색해서 몇번째에 있는지 확인

	//contains('문자열'): 문자열 포함여부
	System.out.println(tmp.contains("H")); 
		
	
	
	
	
	
	
	
	}
}
