public class TesteCatalogo {

	public static void main(String[] args) {
		Filme f1 = new Filme("Matrix","Fic��o","Trilogia Futurista");
		Musica m1 = new Musica("O Melhor","MPB","Som livre");
		Jogo j1 = new Jogo("River Raid","Arcade","PS");
		Filme f2 = new Filme("Senhor dos An�is","Fic��o","Trilogia Hist�rica");
		
		Catalogo catalogo = new Catalogo();
		catalogo.gerar(f1,m1,j1,f2);
		
		
	}
	
}
