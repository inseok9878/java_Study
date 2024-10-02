package temp;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "9408261234567";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민등록번호 자릿수가 아닙니다.");
		}

	}

}
