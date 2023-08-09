package com.tencoding.startcraft;

public class Dragon {
	private String name;
	private int power;
	private int hp;

	public Dragon(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 70;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
