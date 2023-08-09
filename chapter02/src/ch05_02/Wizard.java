package ch05_02;

public class Wizard {
	String name; 
	int power; 
	int hp; 
	int exp;
	int lv;
	
	public Wizard(String name) {
		this.name = name; 
		this.power = 10; 
		this.hp = 70; 
		this.exp = 0;
		this.lv = 1;
	}
	
	public void attackWarrior(Warrior warrior) {
		// 전사를 공격
		warrior.beAttacked(this.power);
		System.out.println("전사를 공격 합니다");
		warrior.hp -= this.power;
		if (warrior.hp == 0) {
			this.exp += 10;
			System.out.println("경험치 획득");
		}
	}
	
	public void attackArcher(Archer archer) {
		// 아처를 공격 합니다. 
		archer.beAttacked(this.power);
		System.out.println("궁수를 공격 합니다");
		archer.hp -= this.power;
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
