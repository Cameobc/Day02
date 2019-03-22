import java.util.Scanner;

public class Day02_4 {
	public static void main(String [] args) {
//		int age =10;
//		if(age>=20) {
//			System.out.println("성년입니다.");
//		}
//		System.out.println("프로그램 종료");
		
		//ex1
		//기말시험 졸업
		//국어, 영어, 수학 입력받기
		//평균이 90점 이상이면 우등상 수여 
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요.");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력해주세요.");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력해주세요.");
		int mat = sc.nextInt();
		int avr = (kor+eng+mat)/3;
		if(avr>=90) {
			System.out.println("우등상을 수여합니다.");
			int num = 100;
			System.out.println(num);
		}
		
		if(avr>=95) {
			System.out.println("장학금을 수여합니다.");
		}
		
		System.out.println("졸업을 축하합니다.");
				
		//스캐너에 소수점 입력
		//double t = sc.nextDouble();
	}

}
