package ch07;

import java.util.Scanner;

public class Company {
	Scanner sc = new Scanner (System.in);
	// 속성, 기능, 생성자, this 3가지 용법을 설계해주세요
	// showInfo 메서드 추가
	String name;
	String phone;
	int age;
	String gender;
	String number;
	
	public Company (String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public Company (String name, String phone, int age) {
		this(name, phone);
		this.age = age;
	}
	
	public Company (String name, String phone, int age, String gender) {
		this(name, phone, age);
		this.gender = gender;
	}
	
	
	// 기능 - 사번등록
	public void input() {
		System.out.println(this.name +" 님의 등록하실 사번을 입력해주세요");
		String newNumber;
		newNumber = sc.nextLine();
		System.out.println(this.name + "님 사번등록 완료");
		this.number = newNumber; 
		this.showInfo();
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("사번 : " + number);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
	}
	
}
