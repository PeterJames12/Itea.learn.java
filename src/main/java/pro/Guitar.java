package pro;

public class Guitar {
	String sound = "aaaaaaa";

	class Combo {
		Combo(String mode) {
			switch (mode) {
			case "overdrive":
				System.out.println(sound.toUpperCase());
				break;
			case "swing":
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < sound.length(); i++) {
					if (i % 2 == 0) {
						sb.append(sound.toUpperCase().charAt(i));
					} else {
						sb.append(sound.charAt(i));
					}
				}
				System.out.println(sb);

			}

		}
	}
}
