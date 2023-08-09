package com.tencoding.startcraft;

import java.util.Scanner;

public class StarcaftGame1 {

	// 메인함수
	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 4;

		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("발업질럿1");
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("스팀팩1");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("발업저글링1");

		Scanner scanner = new Scanner(System.in);
		int unitChoice = -1;

		// do while 문 활용하기
		
		System.out.println("유닛을 선택하세요");
		System.out.println("1. 질럿\t 2. 마린\t 3. 저글링\t 4. 게임종료");
		unitChoice = scanner.nextInt();
		if (unitChoice == ZEALOT) {
			// 질럿선택
			System.out.println("질럿을 선택하였습니다.");
			System.out.println("누구를 공격하시겠습니까?");
			System.out.println("1. 마린\t 2. 저글링");
			unitChoice = scanner.nextInt();
			if (unitChoice == 1) {
				System.out.println("마린을 공격합니다.");
				while (marine1.getHp() > 0) {
					zealot1.attackMarine(marine1);
				}
				System.out.println("마린 체력 : " + marine1.getHp() + "\n" + marine1.getName() + "이 죽었습니다.");
			
			} else if (unitChoice == 2) {
				System.out.println("저글링을 공격합니다.");
				while (zergling1.getHp() > 0) {
					zealot1.attackZergling(zergling1);
				}
				System.out.println("저글링 체력 : " + zergling1.getHp() + "\n" + zergling1.getName() + "이 죽었습니다.");
			}
		} else if (unitChoice == MARINE) {
			// 마린선택
			System.out.println("마린을 선택하였습니다.");
			System.out.println("누구를 공격하시겠습니까?");
			System.out.println("1. 질럿\t 2. 저글링");
			unitChoice = scanner.nextInt();
			if (unitChoice == 1) {
				System.out.println("질럿을 공격합니다.");
				while (zealot1.getHp() > 0) {
					marine1.attackZealot(zealot1);
				}
				System.out.println("질럿 체력 : " + zealot1.getHp() + "\n" + zealot1.getName() + "이 죽었습니다.");
			} else if (unitChoice == 2) {
				System.out.println("저글링을 공격합니다.");
				while (zergling1.getHp() > 0) {
					marine1.attackZergling(zergling1);
				}
				System.out.println("저글링 체력 : " + zergling1.getHp() + "\n" + zergling1.getName() + "이 죽었습니다.");
			}
		} else if (unitChoice == ZERGLING) {
			// 저글링 선택
			System.out.println("저글링을 선택하였습니다.");
			System.out.println("누구를 공격하시겠습니까?");
			System.out.println("1. 마린\t 2. 질럿");
			unitChoice = scanner.nextInt();
			if (unitChoice == 1) {
				System.out.println("마린을 공격합니다.");
				while (marine1.getHp() > 0) {
					zergling1.attackMarine(marine1);
				}
				System.out.println("마린 체력 : " + marine1.getHp() + "\n" + marine1.getName() + "이 죽었습니다.");
			} else if (unitChoice == 2) {
				System.out.println("질럿을 공격합니다.");
				while (zealot1.getHp() > 0) {
					zergling1.attackZealot(zealot1);
				}
				System.out.println("질럿 체력 : " + zealot1.getHp() + "\n" + zealot1.getName() + "이 죽었습니다.");
			}
		} else if (unitChoice == 4) {
			System.out.println("게임을 종료합니다.");
		
		} 
		
	} // end of main

} // end of class
