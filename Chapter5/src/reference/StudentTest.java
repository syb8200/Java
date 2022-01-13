package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJames = new Student(100, "James");
		studentJames.setKorean(100);
		studentJames.setMath(95);
		
		Student studentKate = new Student(101, "Kate");
		studentKate.setKorean(85);
		studentKate.setMath(100);
		
		studentJames.showStudentInfo();
		studentKate.showStudentInfo();

	}

}
