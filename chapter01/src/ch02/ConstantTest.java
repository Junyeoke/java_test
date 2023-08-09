package ch02;

public class ConstantTest {

	// 코드의 시작점 - 메인함수
	public static void main(String[] args) {

		// 변수 != 상수 (상수는 변하지 않는 수)
		// 예약어 (미리 선점해 놓은 단어) - final 키워드를 사용해서 상수라고 지정한다.
		// 권장사항 - 상수를 사용할때는 대문자를 사용하고, 연결의 단어는 _로 사용해서 연결한다.

		final int MAX_NUM = 12;

		// 상수란 한 번 초기화 된 값은 변경할 수 없다.

		System.out.println(MAX_NUM);

		// MAX_NUM = 100; -> 오류발생 (상수로 선언하였기 때문에 변수로 사용불가)

		final int MIN_NUM;

		MIN_NUM = 500;
		// MIN_NUM = 20000; : 상수는 한 번 초기화된 값은 변경 불가

		// 상수는 선언한 부분만 변경하면 되기 때문에 여러번 수정할 필요가 없음.
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);
		System.out.println(MAX_NUM);

		// L value = R value
		int count = 500; // 리터럴 이라고 부른다.

	
	} // end of main

} // end of class
