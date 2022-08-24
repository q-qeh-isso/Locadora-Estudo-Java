public class TesteOverriding {
	
	public static void main(String[] args) {
		
		//Object = TIPO DELCARATIVO | // new Midia() = TIPO DINÂMICO
		Object o1 =  new Filme("Matrix", "Ficção","sinopse");
		//Object o1 = new Musica();
		String objString = o1.toString();
		
		System.out.println("Conteúdo da variavel o1: \n" + objString);
		
		
		
	}

}
