package binary;

public class VariableEx2 {

	public static void main(String[] args) {
		
		int num = 10;
		long num2 = 123456789000L; //저장을 8바이트로 해라. L이나 l 필요
		
		System.out.println(num);
		System.out.println(num2);
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		ch = 66;
		System.out.println(ch);
		
		double dNum = 3.14;
		float fNum = 3.14F; //기본적으로 double로 저장되기 때문에 F나 f 필요
		
		System.out.println(dNum);
		System.out.println(fNum);
		
	}

}
