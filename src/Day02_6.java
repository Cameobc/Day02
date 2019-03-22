import java.util.Scanner;

public class Day02_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int select =15;
//		if(select ==1) {
//			System.out.println("Select 1");
//		}else if(select ==2) {
//			System.out.println("Select 2");
//		}else if(select ==3) {
//			System.out.println("Select 3");
//		}else {
//			System.out.println("Select others");
//		}
		//국어 영어 수학 점수 입력
		//평균구하기
		//평균 90이상이면 A
		//평균 80점이상 B
		//평균 70점이상 C
		//평균 60점이상 D
		//나머지 F
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();
		int total = kor+eng+math;
		int avr = total/3;
		boolean check = false;
		if(avr>=90) {
			System.out.println("A");
			check=!check;   //check가 true임
		}else if(avr>=80) {
			System.out.println("B");
		}else if( avr>=70) {
			System.out.println("C");
		}else if(avr<70 && avr>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		

		if(check) {
			System.out.println("우수상");  //check가 true이면 우수상 출력, 아니면 아무것도 나오지 않음.
		}
		boolean c =true;
		if(c) {
			System.out.println("true");
		}else {
			//dead
			System.out.println("fales");
		}

	}

}
