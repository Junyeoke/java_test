package ch05_01;

public class Student {
	// 속성
	// 학생의 이름, 용돈
	String name;
	int money;

	// 생성자 - 이름, 용돈을 받을 수 있도록 설계
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 기능
	// 학생이 버스를 탄다
	public void takeBus(Bus bus) {
		bus.take(1_300);
		this.money -= 1_300;
	}

	// 학생이 버스를 내린다.
	public void takeOffBus(Bus bus) {
		bus.takeOff(1);

	}
	
	// 학생이 지하철을 탄다.
	public void takeSubway(Subway sub) {
		sub.take(1_400);
		this.money -= 1_400;
	}
	
	// 학생이 지하철을 내린다.
	
	public void takeOffSubway(Subway sub) {
		sub.takeOff(0);
		if(sub.count <= 0) {
			System.out.println("잘못입력하였습니다.");
		}
		sub.count = sub.count - 1;
		System.out.println(sub.count + " 명의 승객이 하차하였습니다.");
	}

	// 상태창 기능
	public void showInfo() {
		System.out.println("=============");
		System.out.println("이름 : " + this.name);
		System.out.println("용돈 : " + this.money);
	}
}
