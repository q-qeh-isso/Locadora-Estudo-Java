public class TesteJogo {

	public static void main(String[] args) {

		Jogo jogo1 = new Jogo("Super Mario Bros", "AVENTURA", "XBOX");
		/*jogo1.setTitulo("Super Mario Bros");
		jogo1.setGenero("AVENTURA");
		jogo1.setPrecoAluguel(38.0);
		jogo1.setConsole("XBOX");*/
		
		//jogo1.mostraDados();
		System.out.println(jogo1); //utiliza metodo reescrito toString() na Midia class
		//System.out.println("Console: " + jogo1.getConsole());

	}

}
