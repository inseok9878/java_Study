package temp;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80 )? 'B' : 'C' );
		System.out.println(score + "점은" + grade + "등급입니다.");
		
		char grade2;
		if(score > 90) {
			grade2 = 'A';
		}else if(score>80) {
			grade2 = 'B';
		}else {
			grade2 = 'C';
		}
		System.out.println(score + "점은" + grade2 + "등급입니다.");
	}

}
