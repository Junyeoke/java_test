package ch04;

public class SubwayMainTest {

	public static void main(String[] args) {

		// 사용자 정의 생성자를 하나만 설계한다면
		// SubWay를 인스턴스화 시키는 방법은 오직 하나만 존재하게 된다.
		
		
		Subway Subway01 = new Subway(1, 20);
		Subway01.showInfo();

		Subway Subway02 = new Subway(2, 30, 2700);
		Subway02.showInfo();
		
		Subway Subway03 = new Subway(3, 150, 1400, 50.99);
		Subway03.showInfo();
		
		Subway Subway04 = new Subway(4, 300, 1400, 100, "냉방중");
		Subway04.showInfo();

	} // end of main

} // end of class
