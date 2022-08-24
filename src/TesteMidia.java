public class TesteMidia {

	public static void main(String[] args) {
	
		//inicia uma variavel m1(instancia) com referencia do tipo Midia (classe)
		System.out.println("OBJETO m1");
		Midia m1 = new Filme("Senhor dos Anéis", "CCCCCCCC","Teste");
		System.out.println("CONSTRUTOR titulo, genero, precoAluguel...");
		//m1.mostraDados();
		System.out.println(m1);
		
		System.out.println("OBJETO m3");
		Midia m3 = new Filme("Matrix","","");
		System.out.println("CONSTRUTOR somente titulo...");
		//m3.mostraDados();
		System.out.println(m3);
		
		System.out.println("OBJETO m4");
		Midia m4 = new Filme("Perdido em Marte", "Ficção", "");
		System.out.println("CONSTRUTOR titulo, genero, precoAluguel, alugada....");
		//m4.mostraDados();
		System.out.println(m4);
		
		System.out.println("OBJETO m5");
		Midia m5 = new Filme("Velozes e Furiosos", "Aventura", "sinopse");
		System.out.println("CONSTRUTOR titulo, genero...");
		//m5.mostraDados();
		System.out.println(m5);
		
		System.out.println("OBJETO m6");
		Midia m6 = new Filme();
		System.out.println("CONSTRUTOR PADRAO");
		//m6.mostraDados();
		System.out.println(m6);
		
		System.out.println("Chamando o toString de m6");
		System.out.println(m6); // m6.toString()
		System.out.println(m6.toString()); // m6.toString()
		System.out.println(m6.hashCode());
		System.out.println();
		
		
		
		
		/*m1.mudarTitulo();
		m1.mudarGenero("CCCC");
		m1.mudarPrecoAluguel(20.01);*/
		
		/*System.out.println("Referencia em Memoria: " + m1);	
		System.out.println("Título = " + m1.titulo); // se nao inicializar o m1, este seria igual a null
		*/

		//Midia m2 = null;
		//System.out.println("*** Objeto m2 ***");
		//System.out.println("Titulo = " + m2.titulo); //NullPoint
		
		//System.out.println("*** Alugando a Midia ***");
		//m1.alugar();	
		//System.out.println(m1);
		//m1.mostraDados();
		
		//m1.devolver();
		//System.out.println(m1);
		//m1.mostraDados();
		
	} //fim main

} //fim class
