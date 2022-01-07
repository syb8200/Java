package loopexample;

public class ForExample {

	public static void main(String[] args) {
		
		//while문과 for문의 비교
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num);

		
		int num2;
		int sum2 = 0;
		
		for(num2 = 1; num2 <= 10; num2++) {
			sum2 += num2;
		}
		
		System.out.println(sum2);
		System.out.println(num2);

		
		
		
	}

}
