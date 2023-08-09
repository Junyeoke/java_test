package ch09;

public class BookMainTest1 {

	public static void main(String[] args) {
		
		// Book book1 = new Book("홍길동전", "허균");
		// 연관된 데이터를 통으로 모아 관리하고 싶다면 배열 - 자료구조 이용
		Book[] arrBooks = new Book[10]; // 배열은 반드시 먼저 크기를 지정해야한다.
		// arrBooks[0] = 10; << 오류 발생
		
		arrBooks[0] = new Book("플러터UI실전", "김근호");
		arrBooks[1] = new Book("무궁화꽃이피었습니다", "김진명");
		arrBooks[2] = new Book("흐르는강물처럼", "파울로코엘료");
		arrBooks[3] = new Book("리딩으로리드하다", "이지성");
		arrBooks[4] = new Book("사피엔스", "유발하라리");
		
		// 배열의 크기는 10 인덱스 마지막 번호는 9이다.
		// 배열은 보통 반복문과 함께 많이 사용된다.
		
		// 배열의 인덱스로 접근해서 . 연산자를 통해 객체의 기능을 호출할 수 있다.
		arrBooks[2].showInfo();
		
		// 10을 코드로 치환하자
		System.out.println("배열의 길이를 알려주는 변수 :" + arrBooks.length);
		
		for(int i = 0; i <arrBooks.length; i++) {
			// 반복문에서는 배열을 어떻게 활용해야 할까?
			// 방어적 코드를 작성해보자
			if(arrBooks[i] != null) {
				arrBooks[i].showInfo();
				System.out.println();
			}	
		}
		
		System.out.println("---------------------------");
		// 주의 : NullPointerException !
		// 2가지 기억
		// 1. 객체를 생성하지 않았거나
		// 2. 변수에 주소값을 할당하지 않았거나
		
		// 배열의 길이와(크기) 안에 들어가 있는 값의 개수는 다를 수 있다.
		
		// 정리
		// 1. 인덱스의 크기는 n-1 개이다.
		// 2. 배열의 길이와 실제로 들어가 있는 값의 갯수는 다를 수 있다.
		// 3. 배열에는 연관된 데이터만 통으로 모아서 관리할 수 있다.
		// 4. 배열은 반복문과 함께 많이 사용한다. - 오류 발생 - 방어적 코드를 잘 작성해주자.
	
		
		
		
	} // end of main

} // end of class
