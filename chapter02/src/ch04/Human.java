package ch04;

// 설계하는 쪽 코드
public class Human {

	// 속성
	String name;
	int height;
	double weight;
	boolean isMan;
	
	// 사용자 정의 생성자
	public Human(String name) {
		this.name = name;
		// !! 생성자 영역 안에서 필요하다면
		// 식을 넣거나, 값을 초기화 하거나
		// 또는 다른 메서드를 호출할 수 있다.
		isMan = true;
		if(this.height == 0) {
			this.height = 180;
		}
		showInfo();
	}
	
	public Human(String name, boolean isMan) {
		this.name = name;
		this.isMan = isMan;
		showInfo();
	}
	
	
	
	//행위
	public void showInfo() {
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별남자인가? : " + isMan);
		System.out.println("이름 : " + name);
		System.out.println("==========================");
	}
	
		
} // end of class
