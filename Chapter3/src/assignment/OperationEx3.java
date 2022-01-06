package assignment;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		boolean value = ( ((num1 = num1 + 10) < 10)  &&  ((i = i + 2) > 10) ); //앞에가 false이기 때문에 뒤에 식을 연산하지 않는다.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		int num2 = 10;
		int j = 2;
		boolean value2 = ( ((num2 = num2 + 10) > 10)  &&  ((j = j + 2) > 10) ); //앞에가 true이기 때문에 뒤에 식을 연산한다.
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(j);
		
		int num3 = 10;
		int k = 2;
		boolean value3 = ( ((num3 = num3 + 10) > 10)  ||  ((k = k + 2) > 10) ); //앞에가 true이기 때문에 뒤에 식을 연산하지 않는다.
		System.out.println(value3);
		System.out.println(num3);
		System.out.println(k);
		
		int num4 = 10;
		int l = 2;
		boolean value4 = ( ((num4 = num4 + 10) > 10)  &&  ((l = l + 2) > 10) ); //앞에가 false이기 때문에 뒤에 식을 연산다.
		System.out.println(value4);
		System.out.println(num4);
		System.out.println(l);
		
	}

}
