package ch05_02;

public class Warrior {
	// 참조 타입 
	String name;
	// 기본 데이터 타입 
	int power; 
	int hp; 
	int exp;
	int lv;
	
	
	public Warrior(String name) {
		this.name = name; 
		this.power = 14; 
		this.hp = 100; 
		this.exp = 0;
		this.lv = 1;

	}
	
	public void attackArcher(Archer archer) {
		//archer 주소값을 넘겨 받은 상태 이다.
		// power ( 값 10 )
		archer.beAttacked(this.power);
		System.out.println("궁수를 공격 합니다");
		archer.hp -= this.power;
		if (archer.hp == 0) {
			this.exp += 10;
			System.out.println("경험치 획득");
		}
	}
	
	public void attackWizard(Wizard wizard) {
		// 마법사를 공격 함 
		wizard.beAttacked(this.power);
		System.out.println("마법사를 공격합니다");
		wizard.hp -= this.power;
		if (wizard.hp == 0) {
			this.exp += 10;
		}
	}
	
	// 내가 공격을 받다 
	public void beAttacked(int power) {
		// 만약 hp 피가 0 이하라면 
		if(this.hp <= 0) {
			System.out.println("이미 사망 !!!");
			this.hp = 0; 
		} else {
			this.hp = this.hp - power;
		}
	}
	
	public void showInfo() {
		System.out.println("== 상태창 ==");
		System.out.println("닉네임 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
		System.out.println("레벨 : " + lv);
		System.out.println("경험치 : " + exp);
	}
}
