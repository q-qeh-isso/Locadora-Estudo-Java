import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteColecaoMidias {
	
	public static void main(String[] args) {
		
		List<Midia> catalogo = new ArrayList<Midia>();
		
		Filme f1 = new Filme("Matrix","Ficção","Trilogia Futurista", 8);
		Jogo j1 = new Jogo("River Raid","Arcade","PS", 50);
		Filme f2 = new Filme("Senhor dos Anéis","Ficção","Trilogia Histórica", 12);
		Jogo j3 = new Jogo("Asteroids","Arcade","XBox", 56);
		Filme f3 = new Filme("A Teoria de Tudo","Drama","Fatos Reais.", 9);
		Musica m1 = new Musica("O Melhor","MPB","Som livre", 23);
		Filme filme1 = new Filme("Holocausto","Drama","Um filme baseado em historia real", 7);
		Musica musica1 = new Musica("Sambas enredo de Sp","Samba","BMG", 30);
		
		catalogo.add(f1);
		catalogo.add(j1);
		catalogo.add(f2);
		catalogo.add(j3);
		catalogo.add(f3);
		catalogo.add(m1);
		catalogo.add(filme1);
		catalogo.add(musica1);
		
		System.out.println(" ***  Catalogo de Midias Diversas  ***");
		catalogo.forEach(x -> System.out.println(x));
		
		Collections.sort(catalogo);
		
		System.out.println("\n\n\n ***  Catalogo Ordenado por Titulo  ***");
		catalogo.forEach(x -> System.out.println(x));
		
		System.out.println("\n\n\n ***  Catalogo Ordenado por Genero  ***");
		//Interface Comparator: public int compare(Midia m1, Midia m2)
		catalogo.sort((x,y) -> x.getGenero().compareTo(y.getGenero()));
		catalogo.forEach(x -> System.out.println(x));
		
		System.out.println("\n\n\n ***  Catalogo Ordenado por Preço  ***");
		//Interface Comparator: public int compare(Midia m1, Midia m2)
		catalogo.sort((x,y) -> {
				if(x.calcularPrecoAluguel() > y.calcularPrecoAluguel()){
					return 1;
				} else if(x.calcularPrecoAluguel() < y.calcularPrecoAluguel()){
					return -1;
				}
				return 0;
		});
		
		catalogo.forEach(x -> System.out.println(x));
				
				
	}

}
