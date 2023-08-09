package ch03;

public class Subway {

	// 지하철 속성
	int subNumber;
	int count;
	int money;

	
	// 기능
	public void take (int m) {
		money += m;
		count++;
	}
	
	

	public void showInfo () {
		System.out.println("==== 상태창 ====");
		System.out.println("이 열차의 호선은 : " + subNumber + "호선");
		System.out.println("이 열차의 승객수는 : " + count + "명");
		System.out.println("이 열차의 현재 수익금은 : " + money);

	}
}
