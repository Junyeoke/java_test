package ch05;

public class Bus {

	// ** 속성 **
	int busNumber; // 버스 노선
	int count; // 승객수
	int money; // 수익금

	// ** 생성자 **
	public Bus(int number) {
		this.busNumber = number;
	}

	// ** 기능 **

	public void run() { // 달린다.
		System.out.println("버스가 출발합니다.");
	}

	public void take(int count) { // 승차시키다.
		// this.count = count + count;
		this.count += count;
		// this.money = this.money + 1_300;
		this.money += (1_300 * count);
	}

	public void takeOff(int count) { // 하차시키다.
		// 만약 0명이라면 -를 해서는 안된다.
		if (this.count <= 0) { // 방어적 코드 작성
			System.out.println("잘못 입력 하였습니다.");
		} else {
			this.count -= count;
			System.out.println(count + " 명의 승객이 내립니다.");
		}

	}

	public void showInfo() { // 정보창
		System.out.println("=== 상태창 ===");
		System.out.println("버스 번호 : " + this.busNumber);
		System.out.println("승객 수 : " + this.count);
		System.out.println("수익금 : " + this.money);
	}

}
