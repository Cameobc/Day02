import java.util.Scanner;

public class Day02_10 {
	public static void main(String[] args) {
		//급여를 입력하세요.
		//1.정규직 -
		// 의료보험 1.2%, 고용보험 0.5%, 산재보험 0.2%, 국민연금 2%
		//2.계약직
		// 원천징수 3.3%
		//3.일용직
		// 소개비 10%
		// 실급여 출력
		Scanner sc = new Scanner(System.in);
				System.out.println("급여를 입력하세요.");
				int sal = sc.nextInt();
				System.out.println("직종을 선택하세요.");
				System.out.println("1.정규직 2.계약직 3.일용직");
				int job = sc.nextInt();
				double k=sal*0.012;
				double o =sal*0.005;
				double r=sal*0.002;
				double e=sal*0.02;
				double total = k+o+r+e;
				double avg = sal-total;
				double g = sal*0.033;
				double avg2 = sal-g;
				double i = sal*0.01;
				double avg3 = sal-i;
				System.out.println("실 수령액을 알려드립니다.");
				switch (job) {
				case 1:
					System.out.println(avg);
					break;
				case 2:
					System.out.println(avg2);
					break;
				case 3:
					System.out.println(avg3);

				default:
					break;
				}
		
	}

}
