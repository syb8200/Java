package classpart;

public class StudnetTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신");
		//Student() = 기본 생성자(class 이름이랑 같아야 한다.), Student = 참조형 데이터 타입, studentLee = 참조 변수
		//studentLee.studentName = "이순신"; //studentLee 옆에 . 을 찍으면 참조할 수 있는 값들이 나오게 된다.
		//studentLee.studentId = 100;
		studentLee.address = "경기도 남양주시 다산동";
		
		Student studentKim = new Student(); 
		studentKim.studentName = "김유신";
		studentKim.studentId = 101;
		studentKim.address = "서울특별시 은평구 신사동";
		
		//studentLee, studentKim = 지역 변수 ({}안에 선언된 변수) = heap 메모리에 생성된 객체의 주소를 가리킴
		//new 생성자를 사용하면 heap 메모리가 생성되고, stack은 해당 코드가 끝나면 자동으로 없어지는데,
		//heap 메모리는 자바의 경우 garbage collector가 존재한다. (c++은 직접 없애줘야 한다.)
		//garbage collector가 주기적으로 돌면서 쓰지 않는 메모리를 수거한다.
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		//이렇게 해서 나온 값 = 참조 값
	}

}
