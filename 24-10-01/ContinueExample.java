package temp;

public class ContinueExample {

	public static void main(String[] args) {
		System.out.println("*** 짝수 출력 ***");
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		System.out.println("*** 홀수 출력 ***");
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
