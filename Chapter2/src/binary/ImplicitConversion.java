package binary;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		System.out.println(bNum);
		
		long lNum = 10;
		float fNum = lNum;
		System.out.println(fNum);
		
		double dNum = fNum + num; //num이 float로 형변환 후 >> 합의 결과가 double로 형변환
		System.out.println(dNum);

	}

}
