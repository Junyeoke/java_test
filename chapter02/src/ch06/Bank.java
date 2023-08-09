package ch06;

import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);

	// 정보 은닉
	// 접근 제어 지시자 private : 자기 자신에서만 사용 가능!
	private String name; // 계좌 번호
	private int balance; // 계좌 잔액
	private int password; // 비밀번호

	// 입금 기능
	public void deposit(int money) {
		this.balance += money; // 자기자신에 + money 값을 더해주면된다.
	}

	// 출금 기능 - 도전 (잔액 0원인데 출금 요청하면 잔액부족 메시지 추가)
	public int withdraw(int money) {
		// 메서드 영역 안에 사용하는 변수는 지역변수라고도 한다.
		int result = 0; // 지역변수 사용할 때 초기화 해주어야 한다.
		if (this.balance < money) {
			// 잔액금액보다 요청 금액이 크다.
			System.out.println("잔액이 부족합니다.");
			return 0;
		} else {
			this.balance -= money;
			result = money;
			return result;
		}
	}
	
	// getter << 리턴값 필요
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// setter << 리턴값 필요없음, 매개변수가 필요
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalnace(int money) {
		// 방어적 코드 작성
		if(money <= 0) {
			System.out.println("잘못입력하였습니다.");
		} else {
			this.balance = money;
		}
	}
	
	// 계좌번호 변경 기능
	public void changeNum() {
		System.out.println("계좌번호 변경 : ");
		this.name = sc.nextLine();
		System.out.println("번호 변경 완료");
		System.out.println("계좌 번호는 : " + name);
	}
	
	// 비밀번호 생성기능
	public void passWord () {
		System.out.println("비밀번호 4자리를 입력해주세요 : ");
		this.password = sc.nextInt();
		System.out.println("입력완료");
		
	}

	// 잔액확인 기능
	public void showInfo() {
		System.out.println("비밀번호를 입력해주세요 : ");
		int password = sc.nextInt();
		if(password == this.password) {
			System.out.println("계좌 번호 : " + name);
			System.out.println("현재 계좌 잔액은 : " + balance + "원 입니다.");
		} else {
			System.out.println("비밀번호가 틀립니다.");
		}
		
	}

} // end of class
