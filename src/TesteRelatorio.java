public class TesteRelatorio {

	public static void main(String[] args) {
		
		Relatorio relat = new Relatorio();
		Object o1 = new Object();
		Object o2 = new Filme("Matrix", "Ficção","sinopse");
		Object o3 = new Musica("Sambas Enredo de SP", "Samba","BMG");;
		Object o4 = new String("Um texto qualquer!");
		Object o5 = new java.util.Scanner(System.in);
		
		
		
		relat.imprimir(o1);
		System.out.println("-----------");
		relat.imprimir(o2);
		System.out.println("-----------");
		relat.imprimir(o3);
		System.out.println("-----------");
		relat.imprimir(o4);
		System.out.println("-----------");
		relat.imprimir(o5);
		System.out.println("-----------");
	}

}
