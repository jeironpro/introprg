public class ProvaBotiga {
	public static void main(String[] args) {
		Botiga botiga = new Botiga(8);
		
		botiga.afegeix(new Vi("LLUMALBA20200001", "Llum d'Alba Blanc", 1750, 12, "P02E03N55D", "Priorat", "blanc", "2020"));
		
		botiga.afegeix(new Vi("CARPATHI20180021", "Carpathia Negre", 3450, 0, "P23E01N43D", "Montsant", "negre", "2018"));
		
		botiga.afegeix(new Vi("MATISNEG20190011", "Matís Negre", 1325, 12, "P20E01N12E", "Pla del Bages", "negre", "2019"));
		
		botiga.afegeix(new Vi("SAOROSAT20180001", "Saó Rosat", 1040, 0, "P02E45N55D", "Costers del Segre", "negre", "2018"));
		
		botiga.afegeix(new Vi("ROURABLA20200232", "Roura blanc", 1012, 42, "P21E45N55E", "Alella", "blanc", "2020"));
		
		botiga.afegeix(new Vi("ROURABLA20200201", "Roura blanc", 906, 0, "P21E45N55E", "Alella", "blanc", "2018"));
		
		botiga.afegeix(new Vi("CERCIUMX20170002", "Cercium", 565, 30, "P23E01N55D", "Empordà", "negre", "2017"));
		
		botiga.afegeix(new Vi("MASIASER20200001", "Masia Serra", 1350, 0, "P02E02N55E", "Empordà", "negre", "2020"));
		
		botiga.iniciaRecorregut();
		while (true) {
			Vi vi = botiga.getSeguent();
			if (vi == null) break;
			System.out.println(vi);
		}
		
		botiga.elimina("CARPATHI20180021");
		botiga.elimina("SAOROSAT20180001");
		botiga.elimina("ROURABLA20200201");
		botiga.elimina("MASIASER20200001");
		System.out.println("Després d'eliminar..............................");
		
		botiga.iniciaRecorregut();
		while (true) {
			Vi vi = botiga.getSeguent();
			if (vi == null) break;
			System.out.println(vi);
		}
	}
}
