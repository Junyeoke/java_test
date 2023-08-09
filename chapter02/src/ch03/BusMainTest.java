package ch03;

public class BusMainTest {

	public static void main(String[] args) {

		Bus bus100 = new Bus();
		Bus bus200 = new Bus();
		// System.out.println(bus100);
		bus100.busNumber = 100;
		bus200.busNumber = 200;

		for (bus100.count = 0; bus100.count < 1000; bus100.count++) {
			bus100.money += 1300;
		}
		for (bus200.count = 0; bus200.count < 100; bus200.count++) {
			bus200.money += 1300;
		}
		bus100.showInfo();
		bus200.showInfo();

	}

}
