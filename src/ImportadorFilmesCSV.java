import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportadorFilmesCSV {
	
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(new FileInputStream("movies-title-genre.csv"))){
			
			List<Filme> filmes = new ArrayList<>();
			while(scan.hasNextLine()){
				String linha = scan.nextLine();
				String[] dadosDoFilme = linha.split(";");
				Filme f = new Filme(dadosDoFilme[0], dadosDoFilme[1]);
				filmes.add(f);
			}
			
			//usando lambda e mostrando apenas titulo e genero
//			filmes.forEach(x -> System.out.println(x.getTitulo() + " - " + x.getGenero()));
			
			//usando o toString()
//			filmes.forEach(x -> System.out.println(x));
			
			filmes.stream().filter(x -> x.getGenero().contains("Drama"))
							.forEach(x -> System.out.println(x));
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
