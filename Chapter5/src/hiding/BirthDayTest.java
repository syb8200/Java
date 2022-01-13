package hiding;

class BirthDay {

	//private를 사용했기 때문에 바로 사용할 수 없고 public 메서드를 이용하여 사용할 수 있다.
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}

public class BirthDayTest { //public은 한 개여야 하고, 클래스 이름이 파일 이름과 동일해야 한다.
	
	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		day.setDay(30);
		day.setMonth(10);
		day.setYear(2022);
		
		System.out.println("오늘은 "+day.getYear()+"/"+day.getMonth()+"/"+day.getDay()+" 입니다.");
	}
	
}
