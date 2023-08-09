package ch06;

public class HeroMainTest {

	public static void main(String[] args) {
		Hero hero1 = new Hero("홍길동");
		hero1.setPower(-1);
		hero1.setName("김길동");
		String retuenName = hero1.getName();
		System.out.println(retuenName);
		System.out.println("==============");
		
		hero1.setDefense(-11);
		hero1.setHp(-11);
		hero1.setLevel(-100);
		hero1.setPower(-111);
		
		
		int returnPower = hero1.getPower();
		System.out.println(returnPower);

	} // end of main

} // end of class
