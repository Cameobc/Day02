
public class Day02_2 {
	public static void main(String [] args) {
		int num =1;
		num = num+1;
		System.out.println(num);
		num++; //num=num+1
		System.out.println(num);
		++num;
		System.out.println(num);
		--num; //num=num-1
		System.out.println(num);
		int r=num++;  //++맨 마지막에 증가시키세요.  
		System.out.println("num : " +num);
		System.out.println("r : " +r);
		r = ++num;
		System.out.println("num : " +num);
		System.out.println("r : " +r);
		
		System.out.println(num++); //프린트 한 후에 증가시켜야 하므로 5!
		
		num = 0;
		num = ++num + num++;
		System.out.println(num);
		
	}
}
