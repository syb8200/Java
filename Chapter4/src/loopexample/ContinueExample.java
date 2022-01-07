package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		
		//짝수만 더하는 문제
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if( (num % 2) == 1) {
				continue;
			}
			
			total += num;
			
		}
		
		System.out.println("1~100 중에 짝수만 더한 값은 " + total + "입니다.");
		
	}

}
