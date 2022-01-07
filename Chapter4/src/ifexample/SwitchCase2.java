package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		int rank = 1;
		char medalColor;
		
		switch(rank) {
		case 1:
			medalColor = 'G';
			break; //이 부분 break문이 없을 경우 결과는 S가 나온다. break문을 만날때까지 수행함.
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';
		}
		
		System.out.println(rank + "등 메달의 색깔은 " + medalColor + "입니다.");
	
	}

}
