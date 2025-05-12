/**
 * Classe que comprova el funcionament de la classe Punt
 */

public class UsaPunt {
	public static void main(String[] args){
		Punt punt = new Punt();
		int x = 0;
		int y = 0;
		
		if (args.length > 0 && UtilString.esEnter(args[0])) {
			x = UtilString.aEnter(args[0]);
		}
		if (args.length > 1 && UtilString.esEnter(args[1])) {
			y = UtilString.aEnter(args[1]);
		}
		punt.setX(x);
		punt.setY(y);
		System.out.printf("punt.getX() -> %d%n", punt.getX());
		System.out.printf("punt.getY() -> %d%n", punt.getY());
	}
}
