public class TesteSetGenero {
	
	public static void main(String[] args) {
		
		//filme esta dentro de m1 DINAMICAMENTE!
		Midia m1 = new Filme();		
		m1.setGenero("ARCADE");
		System.out.println("Setando Arcade para o FILME...");
		System.out.println(m1);
		System.out.println("------------");
		
		//m1.setSinopse("teste sinopse"); //erro de compilacao CAST
		Filme f1 = (Filme) m1;
		f1.setSinopse("teste sinopse");
		System.out.println(f1);
		System.out.println("------------");
		
		m1 = f1; //nao precisa de cast
		if(m1 instanceof Musica){
			Musica mus = (Musica) m1;
		}
		
		m1 = new Jogo();
		m1.setGenero("ARCADE");
		System.out.println("Setando Arcade para o JOGO...");
		System.out.println(m1);
		System.out.println("------------");
		
		m1 = new Musica();
		m1.setGenero("ARCADE");
		System.out.println("Setando Arcade para o MUSICA...");
		System.out.println(m1);
		System.out.println("------------");
		
	}

}
