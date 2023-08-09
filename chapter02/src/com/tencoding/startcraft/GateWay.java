package com.tencoding.startcraft;

public class GateWay {
	private static int zealotTotal = 0;
	private static int dragonTotal = 0;
	//

	// 드라군 생성
	
	public static Dragon createDragon() {
		dragonTotal++;
		return new Dragon("드라군");
	}
	
	public static int totalDragon() {

		System.out.println("생산된 총 드라군의 수 : " + dragonTotal + " 마리");
		return dragonTotal;

	}

	// 질럿 생산합니다.
	public static Zealot createZealot() {
		zealotTotal++;
		return new Zealot("질럿");
	}

	public static int totalZealot() {

		System.out.println("생산된 총 질럿의 수 : " + zealotTotal + " 마리");
		return zealotTotal;

	}

} // end of class
