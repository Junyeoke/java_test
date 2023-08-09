package ch05_01;

public class Bus {
	
	// 버스호선
	// 승객수
	// 수익금
	int busNumber;
	int count;
	int money;
	
	// 생성자 - 버스호선
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 기능
	// 승객을 태우다. (버스요금)
	public void take(int money) {
		this.money += 1_300;
		this.count ++;
	}
	// 승객을 하차시키다.
	public void takeOff(int count) {
		if (this.count <= 0) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			this.count -= count;
			System.out.println(count + " 명의 승객이 내립니다.");
		}
	}
	
	public void showInfo() {
		System.out.println("==============");
		System.out.println("버스 번호 : " + this.busNumber);
		System.out.println("남은승객 수 : " + this.count);
		System.out.println("버스 수익금 : " + this.money);
	}
}
