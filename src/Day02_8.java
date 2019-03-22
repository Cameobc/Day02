import java.util.Scanner;

public class Day02_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("암호화 숫자를 입력하세요.");
		int code = sc.nextInt();
		System.out.println("영어 한 글자를 입력하세요.");
		String str = sc.next();
		char ch = str.charAt(0);
		//a - c
		//b - d   소문자 65`~90 대문자97~122(순환되ㅓ야함)
		//c - e   소문자->소문자, 대문자->대문자, 특수문자 입력x
		int temp = ch+code;
		if(temp>122) {
			int count = temp-122;
			count = 96+count;
			ch =(char)count;
		}else
		ch =(char)temp;
		System.out.println(ch);
//		System.out.println(g);
//		if(g>=65 && g<=90) {
//			System.out.println(g + "대문자 입니다.");
//		}else if(g>=97 && g<=122) {
//			System.out.println(g + "소문자 입니다.");
//		}else {
//			System.out.println(g + "알파벳이 아닙니다.");
//		}
	
			
		
		

		
		
	}

}
