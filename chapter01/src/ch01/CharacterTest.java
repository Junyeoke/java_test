package ch01;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = '가';
		System.out.println(ch1);
		System.out.println((int) ch1);
		System.out.println((int) '가');
		System.out.println("========================");
		// 문제 1
		// 대문자 A는 정수값 얼마인가? 출력하시오.
		// 소문자 a는 정수값 얼마인가? 출력하시오.
		System.out.println((int) 'A');
		System.out.println((int) 'a');
		System.out.println("========================");
		// 주의 char 데이터 타입에는 음수값을 대입할 수 없다. (양수만 사용가능)
		char ch2 = 97;
		char ch3 = 44032;
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println("========================");

		// 문제 2
		// 개발자라는 단어는 한글자 한글자 정수값 얼마, 얼마 인지 알아보자.
		System.out.println((int) '개');
		System.out.println((int) '발');
		System.out.println((int) '자');
		System.out.println("========================");
		System.out.println((char) 44060);
		System.out.println((char) 48156);
		System.out.println((char) 51088);
		System.out.println("========================");
		// 본인이 알고 싶은 단어의 정수 값이 얼마인지 알아보자.
		System.out.println((int) '이');
		System.out.println((int) '준');
		System.out.println((int) '혁');
		System.out.println("========================");
	}

}
