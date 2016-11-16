package pro;

public class Guitar2 {

	private String sound="";

	Guitar2(String sound,String mode) {
		this.sound=sound;
		new Combi(mode);
		System.out.println(this.sound);
	}

	class Combi {
		Combi(String mode) {
			setMode(mode);
		}

		void setMode(String mode) {
			switch(mode){ 
			case "overdrive":
				Guitar2.this.sound=sound.toUpperCase();
				break;
			case "swing":
				StringBuilder sb=new StringBuilder(Guitar2.this.sound.length());
				//char[] sound=Guitar.this.sound.toCharArray();
				for(int i=0;i<Guitar2.this.sound.length();i++){
					if(i%2==0)sb.append(Guitar2.this.sound.toUpperCase().charAt(i));
					else sb.append(Guitar2.this.sound.charAt(i));
				}
				Guitar2.this.sound=sb.toString();
				break;
			}
		}
	}
}
