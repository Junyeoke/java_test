package ch06;

public class BankMainTest {

	// 메인함수
	public static void main(String[] args) {
		
		Bank bank = new Bank(); 		// 지역변수를 초기화
//		System.out.println(bank.balance);
		bank.showInfo();
		// System.out.println(bank.showInfo()); // >> 오류발생
		
		bank.deposit(10_000); 		//	10,000원 입금, return type이 없음
		bank.withdraw(5_000); 	// 5,000원 출금, return type이 있음
		bank.showInfo();
System.out.println("================");
		// 신입이 실수를 한 코드
//		bank.balance = 100_000; << private 추가
		
//		bank.deposit(100_000);
//		bank.withdraw(105_000);
//		bank.showInfo();
//		bank.withdraw(5000);
//		bank.showInfo();
//		bank.withdraw(10000);
//		bank.showInfo();
		
//		bank.showInfo();
//		bank.withdraw(10000);
//		
//		//bank.balance = 1000;
//		
//		bank.setBalnace(-1000);
//		
//		
//		//bank.setName("1234-56789");
//		bank.showInfo();
//		//bank.changeNum("9876-54321");
//		bank.showInfo();
		
		//bank.changeNum();
		//bank.passWord();
		bank.passWord();
		
		
		bank.showInfo();
		
		
		
	} // end of main

} // end of class
