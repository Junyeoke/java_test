package com.tencoding.startcraft;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 질럿 10개를 배열에다 담고 기능을 호출해서 사용해보시오
		// 마린 10개
		// 저글링 n개
		
		// 마린 10마리 생성
		
		Marine[] marines = new Marine[10];
		marines[0] = new Marine("마린1");
		marines[1] = new Marine("마린2");
		marines[2] = new Marine("마린3");
		marines[3] = new Marine("마린4");
		marines[4] = new Marine("마린5");
		marines[5] = new Marine("마린6");
		marines[6] = new Marine("마린7");
		marines[7] = new Marine("마린8");
		marines[8] = new Marine("마린9");
		marines[9] = new Marine("마린10");
		

		for(int i = 0; i < marines.length; i++) {
			if(marines[i] != null) {
				marines[i].showInfo();
				System.out.println();
			}
		}
		
		// 저글링 6마리 생성
		
		Zergling[] zerglings = new Zergling[10];
		zerglings[0] = new Zergling("저글링1");
		zerglings[1] = new Zergling("저글링2");
		zerglings[2] = new Zergling("저글링3");
		zerglings[3] = new Zergling("저글링4");
		zerglings[4] = new Zergling("저글링5");
		zerglings[5] = new Zergling("저글링6");
		

		for(int i = 0; i < zerglings.length; i++) {
			if(zerglings[i] != null) {
				zerglings[i].showInfo();
				System.out.println();
			}
		}
		
		// 질럿 7마리 생성
		Zealot[] zealots = new Zealot[7];
		zealots[0] = new Zealot("질럿1");
		zealots[1] = new Zealot("질럿2");
		zealots[2] = new Zealot("질럿3");
		zealots[3] = new Zealot("질럿4");
		zealots[4] = new Zealot("질럿5");
		zealots[5] = new Zealot("질럿6");
		zealots[6] = new Zealot("질럿7");
		
		for(int i = 0; i < zealots.length; i++) {
			if(zealots[i] != null) {
				zealots[i].showInfo();
				System.out.println();
			}
		}
		
		
		
	} // end of main

} // end of class
