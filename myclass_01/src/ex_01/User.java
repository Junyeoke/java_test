package ex_01;

public class User {
	// 멤버 변수정의

	int userAge;
	String userId;
	String userName;
	String address;
	String userTel;

	// 기능 정의
	public void logIn() {
		System.out.println(userName + "님이 로그인하였습니다.");
	}

	public void logOut() {
		System.out.println(userName + "님이 로그아웃하였습니다.");
	}

	public void userInfo() {
		System.out.println("=== << " + userName + "님의 정보" + " >> ===");
		System.out.println("회원 님의 ID : " + userId);
		System.out.println("회원 님의 이름 : " + userName);
		System.out.println("회원 님의 나이 : " + userAge + "세");
		System.out.println("회원 님의 주소 : " + address);
		System.out.println("회원 님의 연락처 : " + userTel);
		System.out.println("==============================");
	}
}
