public class Catalogo {
	
	public void gerar(Midia... midias){
		//FOR IT
		for (Midia midia : midias){
			System.out.println("Titulo  ....... " + midia.getTitulo());
			System.out.println("Genero  ....... " + midia.getGenero());
			System.out.println("Aluguel ....... R$ " + midia.calcularPrecoAluguel());
			System.out.println();
		}
		
	}

}
