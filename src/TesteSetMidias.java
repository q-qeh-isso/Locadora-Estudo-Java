import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class TesteSetMidias {
	
	public static void main(String[] args) {
		
		Set<Midia> catalogo = new HashSet<Midia>();
		
		catalogo.add(new Filme("Matrix","Ficção","Trilogia Futurista", 8));
		catalogo.add(new Jogo("River Raid","Arcade","PS", 50));
		catalogo.add(new Jogo("River Raid","Arcade","PS", 50));
		catalogo.add(new Jogo("River Raid","Arcade","PS", 50));
		catalogo.add(new Filme("Senhor dos Anéis","Ficção","Trilogia Histórica", 12));
		catalogo.add(new Filme("Senhor dos Anéis","Ficção","Trilogia Histórica", 12));
		catalogo.add(new Jogo("Asteroids","Arcade","XBox", 56));
		catalogo.add(new Filme("A Teoria de Tudo","Drama","Fatos Reais.", 9));
		catalogo.add(new Musica("O Melhor","MPB","Som livre", 23));
		catalogo.add(new Filme("Holocausto","Drama","Um filme baseado em historia real", 7));
		catalogo.add(new Musica("Sambas enredo de Sp","Samba","BMG", 30));

		
		System.out.println("****  CATALOGO DE MIDIAS ****");
		catalogo.forEach(x -> System.out.println(x));
		
		Musica musica = new Musica("O Melhor","MPB","Som livre", 23);
		
		if(catalogo.contains(musica)){
			System.out.println(musica.getTitulo() + " está no catálogo");
		} else {
			System.out.println(musica.getTitulo() + " FORA DO catálogo");
		}
		
		
	}

}
