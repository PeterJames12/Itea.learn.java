package pro;

import java.util.Scanner;

public class Enum {
	enum Day{
		sumsung, philips , lg ;
	}
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String i = in.nextLine();
		Day d = Day.valueOf(i);
		switch(d){
		case sumsung:
			System.out.println("Price: 1000");
			break;
		case philips:
			System.out.println("Price: 900");
			break;
		case lg:
			System.out.println("Price: 950");
			break;
		}in.close();
	}
}
