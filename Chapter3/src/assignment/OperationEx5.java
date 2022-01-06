package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		
		//비트 연산자
		int num1 = 5;
		int num2 = 10;
		int num3 = 11;
		
		int result = num1 & num2;
		int result2 = num1 & num3;
		int result3 = num1 | num2;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		//비트 연산자 - 시프트 연산자
		int num4 = 5; //00000101
		System.out.println(num4 << 2);
		System.out.println(num4); // <<만으로는 num4 값 자체가 변하지 않는다.
		
		System.out.println(num4 <<= 2);
		System.out.println(num4); // <<=(복합대입 연산자)를 해줘야 num4의 값이 변한다.
		
		int num5 = 5; //0000101
		System.out.println(num5 >> 1); //0000010
		
	}

}
