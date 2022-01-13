package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = addNum(num1, num2);
		
		System.out.println(sum);
		
	}
	
	public static int addNum(int n1, int n2) {
		//n1, n2는 addNum에서 새로 선언한 변수
		int result = n1 + n2;
		return result;
		
	}

}
