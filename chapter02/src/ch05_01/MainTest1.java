package ch05_01;

public class MainTest1 {

	public static void main(String[] args) {
		// 버스 객체 3개를 만들어 주세요
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		
		// 지하철 
		Subway sub1 = new Subway(1);
		Subway sub2 = new Subway(2);
		
		
		// 학생 객체 2개를 만들어주세요
		
		Student studentKim = new Student("김철수", 10_000);
		Student studentLee = new Student("이준혁", 50_000);
		// 학생이 버스를 선택해서 승차 및 하차를 시켜보세요

		// 100번 버스
		studentKim.takeBus(bus100);
		studentLee.takeBus(bus100);
		studentKim.takeOffBus(bus100);
		studentLee.takeOffBus(bus100);
		bus100.showInfo();
		
		// 200번 버스
		studentLee.takeBus(bus200);
		bus200.showInfo();
		
		// 300번 버스
		studentKim.takeBus(bus300);
		studentLee.takeBus(bus300);
		bus300.showInfo();
		
		// 김철수
		studentKim.showInfo();
		
		// 이준혁
		studentLee.showInfo();
		
		// 지하철
		studentKim.takeSubway(sub1);
		studentLee.takeSubway(sub1);
		sub1.showInfo();
		
		
	}

}
