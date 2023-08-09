package ch04;

public class Bus {

	// 속성(상태)
	int busNumber;
	int count;
	int money;
	double weight;
	
	// 생성자 만들어보기!
	// How?
	// 생성자는 리턴 타입이 없다. 메서드와 구분할 것!
	// 반드시 클래스 이름과 동일해야 한다.
	
	// 1. 기본 생성자는 컴파일러가 자동으로 만들어준다.
	// 단, 사용자 정의 생성자가 없을 경우에만!
	
	public Bus() {
		
	}
	
	// 개발자가 직접 생성자를 명시하는 것을 
	// 사용자 정의 생성자라고 부른다.
	public Bus(int busNumber) {
		this.busNumber = busNumber; // this. >> 멤버변수를 참조하고 없으면 매개변수를 참조한다.
	}
	
	public Bus(double count) {
		
	}
	public Bus(int busNumber, int count) {
		this.busNumber = busNumber;
		this.count = count;
	}
	
	public Bus(int busNumber, int count, int money) {
		this.busNumber = busNumber;
		this.count = count;
		this.money = money;
	}
	
	// 행위(기능)
	public void take(int m) {
		money += m;
		count++;
	}
	
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("승객 수 : " + count);
		System.out.println("금액 : " + money);
		System.out.println("===================");
	}	
	

} // end of class
