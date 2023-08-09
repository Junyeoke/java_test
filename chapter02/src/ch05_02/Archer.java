package ch05_02;

public class Archer {
	String name; 
	int power; 
	int hp; 
	int exp;
	int lv;
	
	public Archer(String name) {
		this.name = name; 
		this.power = 15; 
		this.hp = 80; 
		this.exp = 0;
		this.lv = 1;
	}
	
	public void attackWarrior(Warrior warrior) {
		// 궁수에 접근해서 그 기능인 공격 당하다를 호출하면 된다. 
		warrior.beAttacked(this.power);
		System.out.println("전사를 공격 합니다");
		warrior.hp -= this.power;
	}
	
	public void attackWizard(Wizard wizard) {
		// 마법사를 공격 합니다. 
		wizard.beAttacked(this.power);
		System.out.println("마법사를 공격 합니다");
		wizard.hp -= this.power;
	}
	
	// 내가 공격 당하다 
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
