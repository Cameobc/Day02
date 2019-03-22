import java.util.Scanner;

public class Day02_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 한 글자를 입력하세요.");
		String str = sc.next();
		char ch = str.charAt(0);
		
		//입력된 글자가 대문자인지->대문자임, 소문자인지->소문자임, 그외 나머지는 알파벳이 아닙니다.
		if(ch>=65 && ch<=90) {
			System.out.println(ch + "대문자입니다.");
		}else if(ch>=97 && ch<=122){
			System.out.println("소문자입니다.");
		}else {
			System.out.println("알파벳이 아닙니다.");
		}

	}

}
