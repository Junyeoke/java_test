package ch01;

public class ArcherMainTest {

	public static void main(String[] args) {
		
		// 이름
		// 키
		// 무게
		// 공격력
		// HP
		// MP
		
		
		Archer a1;
		a1 = new Archer();
		
		a1.name = "큰 아처";
		a1.height = 180;
		a1.weight = 95;
		a1.power = 85;
		a1.hp = 150;
		a1.mp = 95;
		
		
		
		Archer a2;
		a2 = new Archer();
		a2.name = "작은 아처";
		a2.height = 160;
		a2.weight = 50;
		a2.power = 55;
		a2.hp = 100;
		a2.mp = 80;
		

	} // end of main

} // end of class
