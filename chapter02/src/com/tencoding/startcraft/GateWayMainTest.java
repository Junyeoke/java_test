package com.tencoding.startcraft;

public class GateWayMainTest {

	public static void main(String[] args) {

		GateWay gateway1 = new GateWay();
		GateWay gateway2 = new GateWay();
		Zealot zealot1 = gateway1.createZealot();
		Zealot zealot2 = gateway1.createZealot();
		Zealot zealot3 = gateway2.createZealot();
		Zealot zealot4 = gateway2.createZealot();
		Zealot zealot5 = gateway2.createZealot();
		Zealot zealot6 = gateway2.createZealot();
		Dragon dragon1 = gateway1.createDragon();
		Dragon dragon2 = gateway1.createDragon();
		Dragon dragon3 = gateway2.createDragon();
		Dragon dragon4 = gateway2.createDragon();
		GateWay.totalZealot();
		GateWay.totalDragon();
		
		
		// 연습문제
		// 게이트웨이 2개 이상 생성하고 각각 질럿을 뽑아주세요
		// 최종 게이트웨이 간에 뽑아낸 질럿 마리수를 화면에 출력해주세요

	} // end of main

} // end of class
