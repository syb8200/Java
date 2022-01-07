package loopexample;

public class WhilteExample {

	public static void main(String[] args) {
		
		//while문
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		
		//do-while문
		int num2 = 1;
		int sum2 = 0;
		
		do {
			sum2 += num2;
			num2++;
		} while (num2 <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum2 + "입니다.");
		
		
		//while문 vs do-while문 차이점
		int num3 = 1;
		int sum3 = 0;
		
		while (num3 < 1) {
			sum3 += num3;
			num3++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum3 + "입니다.");
		
		
		int num4 = 1;
		int sum4 = 0;
		
		do {
			sum4 += num4;
			num4++;
		} while (num4 < 1);
		
		System.out.println("1부터 10까지의 합은 " + sum4 + "입니다.");
		
		
	}

}
