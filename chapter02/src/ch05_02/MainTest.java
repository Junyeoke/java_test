package ch05_02;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wiz = 1;
		int war = 2;
		int arc = 3;
		int select;
		int attack;

		System.out.println("캐릭터 생성 : 1. 마법사 / 2. 전사 / 3. 궁수");
		select = sc.nextInt();
		if (select == 1) {
			System.out.println("마법사 선택");
			Wizard wiz01 = new Wizard("마법사");
			System.out.println("마법사 생성완료");
			Warrior war01 = new Warrior("전사");
			Archer arc01 = new Archer("궁수");
			System.out.println("누구를 공격하겠습니까? 1. 전사 2. 마법사 3. 궁수");
			attack = sc.nextInt();
			if (attack == 1) {
				wiz01.attackWarrior(war01);
			}

		} else if (select == 2) {
			System.out.println("전사 선택");
			Warrior war01 = new Warrior("전사");
			System.out.println("전사 생성완료");
			Wizard wiz01 = new Wizard("마법사");
			Archer arc01 = new Archer("궁수");
		} else if (select == 3) {
			System.out.println("궁수 선택");
			Archer arc01 = new Archer("궁수");
			System.out.println("궁수 생성완료");
			Wizard wiz01 = new Wizard("마법사");
			Warrior war01 = new Warrior("전사");
		}
		
			
		}
		
		
	
}
		
	

