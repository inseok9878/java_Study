package temp;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: "+ intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: "+ intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: "+ longValue);
		
		longValue = 100; //long 초기화 및 대입할 떄 int 범위를 넘어선 값을 입력할때 L기입
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
