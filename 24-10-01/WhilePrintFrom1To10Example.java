package temp;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-------------");
		// i++의 위치를 바꾸되 결과는 같게
		int i2 = 0;
		while(i2<=9) {
			i2++;
			System.out.println(i2);
			
		}

	}

}
