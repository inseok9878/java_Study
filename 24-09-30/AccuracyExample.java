package temp;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result + " 조각이 남는다.");
		
		System.out.println("---------------");
		
		int totalPieces = apple * 10;
		int temp  = totalPieces - number;
		
		double result2 = temp/10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result2 + " 조각이 남는다.");

	}

}
