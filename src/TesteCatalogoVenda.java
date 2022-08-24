public class TesteCatalogoVenda {
	
	public static void main(String[] args) {
		Filme f1 = new Filme("Matrix","Ficção","Trilogia Futurista");
		Sorvete s1 = new Sorvete("Morango","Kibom");
		Jogo j1 = new Jogo("River Raid","Arcade","PS");
		Sorvete s2 = new Sorvete("Abacaxi","Nestle");
		Filme f2 = new Filme("Senhor dos Anéis","Ficção","Trilogia Histórica");
		Jogo j3 = new Jogo("Asteroids","Arcade","XBox");
		Filme f3 = new Filme("A Teoria de Tudo","Drama","Fatos Reais.");
		Sorvete s3 = new Sorvete("Flocos","Gellato");
		
		
		Negociavel[] produtos = {f1,s1,j1,s2,f2,j3,f3,s3};
		
		
		CatalogoDeVenda catalogo = new CatalogoDeVenda();
		catalogo.gerar(produtos);
		
		
	}

}
