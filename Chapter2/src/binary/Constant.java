package binary;

public class Constant {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100; //대부분 상수는 대문자로만 표현해준다.
		final double PI = 3.14;
		
		System.out.println(MAX_NUM);
		System.out.println(PI);
		
		//PI = 3.15; //final로 선언했기 때문에 3.1로 변경되지 않는다.
		
		final int STUDENT_NUM = 30; //한꺼번에 수정 가능하다.
		int num = 0;
		
		if(num == STUDENT_NUM) {}
		System.out.println(STUDENT_NUM);

	}

}
