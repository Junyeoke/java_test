package ch09;

public class ArrayMainTest2 {

	public static void main(String[] args) {
		
		// 변수는 크게 몇가지가 존재한다고 하였나요?
		// 기본 데이터 타입, 참조 타입
		
		char[] ch1 = new char[10];  // 기본 데이터 타입(연관된 데이터) >> 기본데이터 타입에는 값이 바로 들어감
		ch1[0] = 'H';
		ch1[1] = 'E';
		ch1[2] = 'L';
		
		String[] strings = new String[5]; // 참조 타입 >> 참조타입은 값이 들어가는 것이 아니라 '주소값'이 들어간다.
		strings[0] = "안녕 반가워";
		strings[1] = "안녕 반가워";
		strings[2] = "안녕 반가워";
		
		
		
	} // end of main

} // end of class
