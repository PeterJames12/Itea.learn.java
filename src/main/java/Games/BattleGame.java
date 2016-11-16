package Games;

import java.util.Arrays;

public class BattleGame {
	char[] field = { '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' };
	int healthH = 100;
	int healthM = 100;
	int damage = 0;
	int select;
	String champion;
	String monster;

	void setSelect(int sel) {
		select = sel;
		if (select == 1) {
			champion = "Shepard";
			healthH += 100;
			field[0] = '#';
		} else if (select == 2) {
			champion = "Collector";
			healthH += 50;
			field[0] = '$';
		} else if (select == 3) {
			champion = "Reaper";
			healthH += 30;
			field[0] = '%';
		}
		System.out.println("You choose: " + champion);
		System.out.println(champion + "'s health: " + healthH);
		System.out.println("Your field: " + Arrays.toString(field));
	}

	void setSelectMon(int sel) {
		select = sel;
		if (select == 1) {
			monster = "Kraken";
			healthM += 100;
			field[9] = '@';
		} else if (select == 2) {
			monster = "Freddy";
			healthM += 50;
			field[9] = '&';
		} else if (select == 3) {
			monster = "Illidan";
			healthM += 30;
			field[9] = '~';
		}
		System.out.println("You choose: " + monster);
		System.out.println(monster + "'s health: " + healthM);
		System.out.println("Your field: " + Arrays.toString(field));
	}

	void setAttackToMon() {

		damage = (int) (Math.random() * 100);
		healthM -= damage;
		System.out.println(monster + "'s health: " + healthM);
	}

	void setAttackToHero() {

		damage = (int) (Math.random() * 100);
		healthH -= damage;
		System.out.println(champion + "'s health: " + healthH);
	}
}
