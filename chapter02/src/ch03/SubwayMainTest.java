package ch03;

public class SubwayMainTest {

	public static void main(String[] args) {

		Subway sub01 = new Subway();
		Subway sub02 = new Subway();

		sub01.subNumber = 1;
		sub02.subNumber = 2;

		for (sub01.count = 0; sub01.count < 10; sub01.count++) {
			sub01.money += 1400;
		}
		for (sub02.count = 0; sub02.count < 200; sub02.count++) {
			sub02.money += 1400;
		}

		sub01.showInfo();
		sub02.showInfo();
	

	}

}
