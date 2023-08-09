package ch08;

public class CompanyMainTest {

	public static void main(String[] args) {
		// 1.
		// 생성자를 private로 선언했기 때문에 
		// 기본 생성자로 호출할 수 없다.
		// Company company = new Company();
		
		// 2.
		// Company.instance -> 접근 제어 지시자가 private 이다.
		
		// 3.
		// 외부에서 유일하게 Company 객체 주소값에 접근할 수 있는 메서드
		Company naver = Company.getInstance();
		Company tenco = Company.getInstance();
		System.out.println(naver);
		System.out.println(tenco);
		Company mata = Company.getInstance();
		System.out.println(mata);
		
	} // end of main

} // end of class
