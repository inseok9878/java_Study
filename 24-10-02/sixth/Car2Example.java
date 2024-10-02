package sixth;

public class Car2Example {

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println("car1.company:" + car1.company);
		System.out.println();
		
		Car2 car2 = new Car2(null);
		System.out.println("car2.company:" + car2.company);
		System.out.println("car2.model:" + car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("자가용","빨강");
		System.out.println("car3.company:" + car3.company);
		System.out.println("car3.model:" + car3.model);
		System.out.println("car3.color:" + car3.color);
		System.out.println();
		
		Car2 car4 = new Car2("자가용","빨강",200);
		System.out.println("car4.company:" + car4.company);
		System.out.println("car4.model:" + car4.model);
		System.out.println("car4.color:" + car4.color);
		System.out.println("car4.maxSpeed:" + car4.maxSpeed);
		System.out.println();

	}

}

// 만약 model을 모르고 색상만 알고있을 경우에는 Car2(null,"color")로 사용
