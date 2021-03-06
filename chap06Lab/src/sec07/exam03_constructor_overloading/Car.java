package sec07.exam03_constructor_overloading;

public class Car {
	// 클래스의 구성 멤버
	// 1. 필드
	String company = "현대자동차";
	String model;
	String color; // null
	int maxSeed;  // 0
	
	// 2. 생성자
	Car() {
		
	}
	
	// constructor overloading
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;  // this.는 자기 자신의 객체를 의미한다.
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSeed = maxSpeed;
	}
	
	
	
	// 3. 메소드

}
