import java.util.Scanner;

public class Day02_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal =0; // 급여를 담을 변수
		int select=0; // 유형을 담을 변수
		double result=0.0; // 실급여를 담을 변수
		System.out.println("급여를 입력하세요");
		sal = sc.nextInt();
		System.out.println("1. 정규직");
		System.out.println("2. 계약직");
		System.out.println("3. 일용직");
		select = sc.nextInt();
		
		switch(select){
			case 1:
				result = sal-sal*0.03;
				break;
			case 2:
				result = sal-sal*0.033;
				break;
			case 3:
				result = sal-sal*0.01;
				break;
				default:
		}
		System.out.println("실급여 : "+result+"원");
	}

}
