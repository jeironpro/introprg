/**
 * Classe que comprova el funcionament de la classe Punt
 */

public class UsaPunt {
	public static void main(String[] args){
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;

		if (args.length > 0 && UtilString.esEnter(args[0])) {
			x1 = UtilString.aEnter(args[0]);
		}
		
		if (args.length > 1 && UtilString.esEnter(args[1])) {
			y1 = UtilString.aEnter(args[1]);
		}
		
		if (args.length > 2 && UtilString.esEnter(args[2])) {
			x2 = UtilString.aEnter(args[2]);
		}
		
		if (args.length > 3 && UtilString.esEnter(args[3])) {
			y2 = UtilString.aEnter(args[3]);
		}
		Punt p1 = new Punt(x1, y1);
		Punt p2 = new Punt(x2, y2);
		System.out.printf("p1: (%d, %d)%n", p1.getX(), p1.getY());
		System.out.printf("p2: (%d, %d)%n", p2.getX(), p2.getY());
		p1.suma(p2);
		System.out.printf("p1+p2: (%d, %d)%n", p1.getX(), p1.getY());
	}
}
