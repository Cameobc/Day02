import java.util.Scanner;

public class Day2_12 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 입력받기
		//평균이 90점 이상 A
		//평균 80점 이상 B
		//평균 70점 이상  C
		//평균 60점 이상 D
		//그외 F
		
		
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("국어 점수를 입력해주세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		int math = sc.nextInt();
		int avr = (kor+eng+math)/3;
		String grade=null; //String grade=""
		switch(avr/10) {
			case 10:
			case 9:
				grade ="A";
				break;
			case 8:
				grade ="B";
				break;
			case 7:
				grade ="C";
				break;
			case 6:
				grade ="D";
				break;
			default:
				grade ="F";
		}
	System.out.println(grade);
	}

}
