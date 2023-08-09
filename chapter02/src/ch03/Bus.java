package ch03;

public class Bus {

	// 속성
	int busNumber;
	int count;
	int money; // 수익금
	
	// 기능
	public void take(int m) {
		// 0 = 0 + 1300 >> 1300
		// 1300 = 1300 + 1300 >> 2600
		money += m;	
		count = count + 1;
	}
	
	
	public void showInfo () {
		System.out.println(" ==== 상태 창 ====");
		System.out.println("버스번호는 : " + busNumber + "번");
		System.out.println("승객 수는 : " + count + "명");
		System.out.println("현재 수익금은 : " + money + "원");
		
	}
}
