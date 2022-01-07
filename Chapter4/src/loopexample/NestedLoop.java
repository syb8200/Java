package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		
		//for문으로 중첩 반복문 만들기 (구구단 2단 ~ 9단)
		int front;
		int back;
		int value = 0;
		
		for(front = 2; front <= 9; front++) {
			for(back = 1; back <=9; back++) {
				
				value = front * back;
				System.out.println(front +" X " + back + " = " + value);
			}
			
			System.out.println();
			
		}
		
		System.out.println("구구단 끝!");
		
	}

}
