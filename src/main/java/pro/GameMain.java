package pro;

import java.util.Arrays;

public class GameMain {
	

	public static void main(String[] args) throws Exception {
		Item[] i = new Item[2];
		int []u = {5,5,5};
		i[0] = new BootsOfPower();
		i[1] = new BootsOfSpeed();
		new Controller(
				new Zeus(i[1],i[1]),
				new Pudge(i[0],i[1]));
		{
			
		}
				

		// Zeus z2=new Zeus(bp.getCharacteristics(), bs.getCharacteristics(),
		// bs.getName(), bp.getName());
		// char[] field = { '$', '_', '_', '_', '_', '_', '_', '_', '_', '@' };
		// if(bs.getName().equals(Arrays.toString(Items.values())) &&
		// bp.getName().equals(Arrays.toString(Items.values()))){
		// do{
		/*
		 * for (int i = 1; i < 9; i++) { field[i] = '>';
		 * System.out.println(Arrays.toString(field)); field[i] = '_';
		 * Thread.sleep(200); }
		 */
		// z2.setHealth(p1.getStrike());
		// System.out.println("Zeus current health:"+z2.getHealth());

		/*
		 * for (int i = 8; i > 0; i--) { field[i] = '<';
		 * System.out.println(Arrays.toString(field)); field[i] = '_';
		 * Thread.sleep(200); }
		 */
		// p1.setHealth(z2.getStrike());
		// System.out.println("Pudge current health:"+p1.getHealth());
		// }while (p1.getHealth()>=0 || z2.getHealth()>=0) ;

		// System.out.println("Won"+(p1.getHealth()==z2.getHealth()?" no
		// one":p1.getHealth()>z2.getHealth()?" Pudge":" Zeus"));

	}
}

// }
