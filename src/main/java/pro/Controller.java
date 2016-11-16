package pro;

public class Controller {
	Controller(Hero h1,Hero h2){
do {
			h2.setHealth(h1.getStrike());
			System.out.println("Hero 2 current health:" + h2.getHealth() );
			h1.setHealth(h2.getStrike());
			System.out.println("Hero 1 current health:" + h1.getHealth() );
		} while (h1.getHealth() >= 0 || h2.getHealth() >= 0);

		System.out.println("Won" + (h1.getHealth() == h2.getHealth() ? " no one"
				: h1.getHealth() > h2.getHealth() ? " Pudge" : " Zeus"));
	}
}
