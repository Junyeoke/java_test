package ch06;

import java.util.Scanner;

public class Book {
	Scanner sc = new Scanner(System.in);

	// 멤버변수
	private int bookNum;
	private String name;
	private int price;

	// 생성자
	public void newBook(int num, String name, int price) {
		this.bookNum = num;
		this.name = name;
		this.price = price;
	}

	// getter
	public int getBookNum() {
		return bookNum;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;

	}

	// setter
	public void setBookNum(int num) {
		this.bookNum = num;
		if (num <= 0) {
			System.out.println("잘못입력하였습니다.");
		} else {
			this.bookNum = num;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		if (price <= 0) {
			System.out.println("잘못입력하였습니다.");
		} else {
			this.price = price;
		}

	}

	// 기능

	// 책이름 생성
	public void newName() {
		System.out.print("추가할 책의 이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println(this.name + " 책 추가완료!");

	}

	// 책번호 생성
	public void newNumber() {
		System.out.print(this.name + "책의 책번호를 부여해주세요 : ");
		int newNum;
		newNum = sc.nextInt();
		if (newNum <= 0) {
			System.out.println("책번호를 잘못입력했습니다. 숫자 1번부터 부여 가능합니다.");
		} else {
			this.bookNum = newNum;
			System.out.println(this.name + "의 책번호는 " + this.bookNum + " 입니다.");
		}

	}

	// 책번호 입력시 정보제공

	public void showInfo() {
		System.out.print("책 정보를 찾으시려면 책 번호를 입력해주세요 : ");
		int inputNum;
		inputNum = sc.nextInt();
		if (inputNum == this.bookNum) {
			System.out.println("==== 책정보 ====");
			System.out.println("책 이름 : " + this.name);
			System.out.println("책 번호 : " + this.bookNum);
			System.out.println("금액 : " + this.price + "원");
		} else {
			System.out.println("등록된 책 번호가 아닙니다.");
		}
	}

// 책 가격 등록
	public void newPrice() {
		System.out.print("책 금액을 등록해주세요 : ");
		int inputPrice;
		inputPrice = sc.nextInt();
		this.price = inputPrice;
		System.out.println(this.name + "책의 가격이 " + this.price + " 원 으로 등록되었습니다.");
	}
}
