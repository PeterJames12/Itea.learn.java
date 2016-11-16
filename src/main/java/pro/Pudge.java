package pro;

public class Pudge extends Hero {

	Pudge(Item i1, Item i2) {
		super( i1,  i2);
	}

	/*void getInfo() {
		System.out.println("Pudge info:");
		super.getInfo();
	}*/
	
	void getInfo() {
		System.out.println("Pudge info:");
		System.out.println("Health:" + health);
		System.out.println("intelligence:" + intelligence);
		System.out.println("agility:" + agility);
		System.out.println("strength:" + strength);
		System.out.println("strike:" + strike);
		System.out.println("Slot1:" + slot1);
		System.out.println("Slot2:" + slot2);
	}
}