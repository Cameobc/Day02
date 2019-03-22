import java.util.Scanner;

public class Day02_3 {
	public static void main(String []args) {
		// 삼항연산자 형식
		//조건식 - 결과물이  boolean 타입이 나오면 된다.
		//조건식 ? A:B;
		//조건식이 true라면 A를 실행하고, false라면 B를 실행.
		
//		int num =3;
//		String result = num%2==0?"짝수":"홀수";
//		System.out.println(result);
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		//10대냐 아니냐.10~19
		String result = 10<=age && age<=19?"십대":"아님";
		System.out.println(result);  //sysout, sout +ctrl space
		
	}
}
