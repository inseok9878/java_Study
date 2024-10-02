package sixth;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

	}

}
//같은 패키지 일때는 import 할 필요가 없음
