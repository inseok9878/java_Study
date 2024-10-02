package temp;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for(int i=0; i<scores.length;i++) {
			sum1 +=scores[i];
		}
		System.out.println("총합:  " + sum1);
		
		//int sum2 = add(new int[] {83,90,87});
		int sum2 = _add(scores);
		System.out.println("총합 : "+sum2);
		System.out.println();
		/*
		byte _byte;
		_byte = 4;
		String _String;
		_String = "스트링";
		int[] _scores;
		_scores = {83,90,70};
		*/
	}
	public static int _add(int[]scores) {
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum +=scores[i];
		}
		return sum;
	}
}

