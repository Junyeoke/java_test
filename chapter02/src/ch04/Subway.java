package ch04;

public class Subway {

	// 1. 멤버 변수를 설계
	int subNumber;
	int count;
	int money;
	double weight;
	String ac;

	// 2. 생성자 2개 이상 설계
	public Subway() {

	}

	public Subway(int subNumber, int count) {
		this.subNumber = subNumber;
		this.count = count;
	}

	public Subway(int subNumber, int count, int money) {
		this.subNumber = subNumber;
		this.count = count;
		this.money = money;
	}
	
	public Subway(int subNumber, int count, int money, double weight) {
		this.subNumber = subNumber;
		this.count = count;
		this.money = money * count;
		this.weight = weight;
	}
	
	public Subway(int subNumber, int count, int money, double weight, String ac) {
		this.subNumber = subNumber;
		this.count = count;
		this.money = money;
		this.weight = weight;
		this.ac = ac;
	}

	// 3. 지하철에 맞는 메서드를 설계
	public void showInfo() {
		System.out.println("====== 지하철 정보 ======");
		System.out.println("지하철 호선 : " + subNumber + " 호선");
		System.out.println("승객수 : " + count + " 명");
		System.out.println("수익금 : " + money + " 원");
		System.out.println("톤 수 : " + weight + " ton");
		System.out.println("냉방여부 : " + ac);
	}
} // end of class
