package pro;

public abstract class Hero {
	int health = 100;
	int intelligence = 5;
	int agility = 5;
	int strength = 5;
	int strike = (intelligence / 3) + (agility / 2) + strength;
	String slot1 = "";
	String slot2 = "";
	int critChance;

	Hero(Item i1, Item i2) {

		setSlot1(i1.getName());
		setSlot2(i2.getName());
		setItem(i1.getCharacteristics());
		setItem(i2.getCharacteristics());
		getInfo();

	}

	void setItem(int[] getCharacteristics) {
		this.intelligence += getCharacteristics[0];
		this.agility += getCharacteristics[1];
		this.strength += getCharacteristics[2];
		setStrike();
	}

	abstract void getInfo();

	void setStrike() {
		strike = (intelligence / 3) + (agility / 2) + strength;

	}

	int getStrike() {
		return strike;
	}

	void setHealth(int h) {
		setCritChance();
		if (critChance > 80) {
			h *= 2;
		}
		health -= h;
	}

	int getHealth() {
		return health;
	}

	void setCritChance() {
		critChance = (int) (Math.random() * 100);
	}

	void setSlot1(String slot1) {
		this.slot1 = slot1;
	}

	void setSlot2(String slot2) {
		this.slot2 = slot2;
	}

}
