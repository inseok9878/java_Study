package temp;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "940826-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String seconedNum = ssn.substring(7);
		System.out.println(seconedNum);

	}

}
