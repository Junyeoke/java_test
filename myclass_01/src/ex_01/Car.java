package ex_01;

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	Car() {} // 생성자 1
	
	Car(String model) {   		//생성자 2
		this.model = model;
	}
	
	Car(String model, String color) {		//생성자 3
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
		
	} // end of class

