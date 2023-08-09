package ch04;

public class Student {

	// 기본 생성자는 자동으로 컴파일러가
	// .class로 컴파일 할 때 만들어 준다.
	// 단, 사용자 정의 생성자가 없는 경우에만!
	// 자동으로 만들어준다!
	String name;
	
	// 기본생성자 정의
	public Student () {
		
	}
	
	public Student (String name) {
		this.name = name;
	}
	
	// 생성자 오버로딩이란
	// 여러가지 생성자를 만들어 둔 상태를 의미한다.
	
} // end of class
