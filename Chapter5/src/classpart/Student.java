package classpart;

public class Student {
	
	//멤버 변수 (property, attribute 라고도 표현함)
	int studentId;
	String studentName;
	int grade;
	String address;
	
	//생성자 오버로딩
	public Student() {} //기본 생성자 (default 생성자)
	//컴파일러가 default 생성자를 주는 이유는 생성자가 하나도 없는 경우에만 준다.
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
	} //생성자를 하나라도 만들게 되면 이때는 default 생성자를 지원해주지 않는다.
	
	public void showStudentInfo() {
		
		System.out.println(address + "에 거주하는 " + studentId + "번인 "+ studentName);
	}
	
	public String getStudentName() {
		//이 클래스를 사용하는 쪽 입장에서 메서드 이름 작성 (get)
		return studentName;
	}
	
	public void setStudentName(String name) {
		//학생 이름을 바꾸고 싶을 때 (set)
		studentName = name;
	}
	
}
