package ex_03;

public class Bank {
	
	private String name;		// 계좌 번호
	private int balance; 		// 계좌 잔액
	
	
	// 입금기능
	public void deposit (int money) {
		this.balance += money;
	}
	
	// 출금기능
	public int withdraw(int money ) {
		int result = 0;
		if (balance <= 0) {
			System.out.println("잔액이 부족합니다.");
		} else {
			this.balance -= money;
			result = money;
		}
		return result;
	}
	
	// 잔액확인
	public void showInfo () {
		System.out.println("현재 잔액은 : " + balance + "원 입니다.");
	}
	
	
} // end of class
