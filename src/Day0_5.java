import java.util.Scanner;

public class Day0_5 {
	public static void main(String[] args) {
//		int score=60;
//		
//		if(score>=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("탈락");
//		}
		
		//회원가입시 입력한 정보
		int id = 1234;
		int pw  = 5678;
		
		//yid입력
		//ypw입력
		//로그인 성공 출력, 로그인 실패
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		int yid = sc.nextInt();
		System.out.println("비밀번호를 입력하세요.");
		int ypw = sc.nextInt();
		String result ="로그인 실패";
		if(yid==id && ypw==pw) {
			result = "로그인 성공";
			}
		System.out.println(result);

		
		
		//		if(yid==id && ypw==pw) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		//단일if문
		
		
		
	}

}
