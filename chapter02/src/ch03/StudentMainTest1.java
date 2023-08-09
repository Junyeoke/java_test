package ch03;

public class StudentMainTest1 {

	public static void main(String[] args) {
		
		Student studentKim = new Student(); // 힙영역에 추가됨
		studentKim.studentId = 1; // 변수호출
		studentKim.studentName ="티모";
		studentKim.address = "블루진영";
		
		studentKim.study(); // 끝에 괄호가 오면 함수호출 메서드를 호출
		studentKim.breakTime();
		studentKim.showInfo();
		
		Student studentLee = new Student();
		studentLee.studentId = 2;
		studentLee.studentName = "야스오";
		studentLee.address = "레드 진영";
		
		studentLee.showInfo();
		// 멤버 변수는 값을 초기화하지 않으면 기본값으로 컴파일러가 값을 넣어 만들어준다.
		

	}

}
