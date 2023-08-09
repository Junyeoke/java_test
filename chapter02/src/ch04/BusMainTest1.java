package ch04;

public class BusMainTest1 {

	public static void main(String[] args) {
	
		// bus100 >> stack에 올라가고 
		// 실제 생성되는 객체는 힙 영역에 올라간다.
		// 인스턴스화 하였다.
		Bus bus100 = new Bus();
		bus100.busNumber = 100;
		bus100.count = 0;
		bus100.money = 0;
		// 여러줄로 작성된 코드를(위) (아래)생성자를 사용하여 한줄로 작성할 수 있음
		
		// 생성자 사용해보기(사용자 정의 생성자)
		Bus bus200 = new Bus(200);
		bus200.showInfo();
		
		// 매개변수 순서대로 값을 입력해주어야 한다.
		Bus bus300 = new Bus(300, 1);
		bus300.showInfo();
		
		Bus bus400 = new Bus(400, 1, 1300);
		bus400.showInfo();
		
	} // end of main

} // end of class
