package Games;

import java.util.Arrays;
import java.util.Scanner;

public class BattleMain {

	public static void main(String[] args) throws InterruptedException {

		Scanner in = new Scanner(System.in);
		BattleGame hero = new BattleGame();
		System.out.println("Choose your hero: 1 - Shepard; 2 - Collector; 3 - Reaper");
		hero.setSelect(in.nextInt());
		System.out.println("Choose your monster: 1 - Kraken; 2 - Freddy; 3 - Illidan");
		hero.setSelectMon(in.nextInt());
		Thread.sleep(2000);
		for (int i = 1; i < 9; i++) {
			hero.field[i] = '>';
			System.out.println(Arrays.toString(hero.field));
			hero.field[i] = '_';
			Thread.sleep(500);
		}
		hero.setAttackToMon();

		Thread.sleep(2000);

		for (int i = 8; i > 0; i--) {
			hero.field[i] = '<';
			System.out.println(Arrays.toString(hero.field));
			hero.field[i] = '_';
			Thread.sleep(500);
		}
		hero.setAttackToHero();
		System.out.println(hero.healthH > hero.healthM ? hero.champion + " win" : hero.monster + " win");
		in.close();
	}
}
