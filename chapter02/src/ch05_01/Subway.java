package ch05_01;

public class Subway {

	int subNumber;
	int count;
	int money;
	boolean ac;
	
	public Subway(int subNumber) {
		this.subNumber = subNumber;
	}
	
	public void take(int money) {
		this.count += count;
		this.money = (1_400*count);
	}
	
	public void takeOff(int count) {
		if (this.count <= 0) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			this.count -= count;
		}
	}
	
	public void acControl(int count) {
		if(this.count >= 2) {
			ac = true;
			System.out.println("사람이 많아 냉방을 시작합니다.");
		} else {
			ac = false;
			System.out.println("에너지 절약을 위해 냉방을 끕니다.");
		}
	}
	
	public void showInfo() {
		System.out.println("==============");
		System.out.println("호선 : " + subNumber);
		System.out.println("승객 수 : " + count);
		System.out.println("수익금 : " + money);
		System.out.println("냉방 여부 : " + ac);
	}
}
