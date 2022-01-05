package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum); //잘라서 넣다보니 앞이 1이되어 음수가 나오게 된 것.
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum); //소수점 밑으로 유실, 정수부분만 나오게 된다.
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
