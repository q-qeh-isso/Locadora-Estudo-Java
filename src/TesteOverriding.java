public class TesteOverriding {
	
	public static void main(String[] args) {
		
		//Object = TIPO DELCARATIVO | // new Midia() = TIPO DIN�MICO
		Object o1 =  new Filme("Matrix", "Fic��o","sinopse");
		//Object o1 = new Musica();
		String objString = o1.toString();
		
		System.out.println("Conte�do da variavel o1: \n" + objString);
		
		
		
	}

}
