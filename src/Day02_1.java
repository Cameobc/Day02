import java.util.Scanner;

public class Day02_1 {
	public static void main(String [] args) {
		int num = 10;
		int num2 = 10;
		System.out.println(num == num2);
		System.out.println(num!=num2);
		double d = 10;
		System.out.println(num==d);
		String str1 = "10";
		String str2 = "10";
////		System.out.println(str1==num); String type은 등호로 비교 xxxxx
//		System.out.println(str1==str2);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력");
//		String str3 = sc.next();
//		System.out.println(str1==str3);
		char ch ='a';
		System.out.println(ch==96);  //ch를  int 로 형변환 해서 비교함
		System.out.println(ch+1);
		//고등학교 졸업 이고, 토익 800점 이상이고, 해외연수 경험이 필 삼성
		//고등학교 졸업 이거나, 토익 800점 이상이건, 해외연수 경험 있거나 구글
	
		int n1=3;
		int n2=5;
		System.out.println(n1&n2);
		System.out.println(n1|n2);
		System.out.println(~n1);
		System.out.println(n1<<2);
	}
}