package ex_01;

public class UserMainTest {

	public static void main(String[] args) {

		User UserKim = new User();
		UserKim.userName = "김철수";
		UserKim.userId = "kimchulsoo1234";
		UserKim.address = "부산광역시";
		UserKim.userAge = 25;
		UserKim.userTel = "010-1234-5678";

		UserKim.logIn();
		UserKim.logOut();
		UserKim.userInfo();

		User UserPark = new User();
		UserPark.userName = "박민수";
		UserPark.userId = "minsupark5555";
		UserPark.address = "서울특별시";
		UserPark.userAge = 30;
		UserPark.userTel = "010-5555-4444";

		UserPark.logIn();
		UserPark.logOut();
		UserPark.userInfo();

	}

}
