public abstract class Midia implements Comparable<Midia>{

	public static final double PRECO_MINIMO = 4;
	
	private String titulo;
	private String genero = "INDEFINIDO";
	private double precoAluguel;
	private boolean alugada;
	
	@Override
	public int compareTo(Midia outra){
		return this.getTitulo().compareTo(outra.getTitulo());
	}
	
	
	// NOVO CONTRUTOR
	public Midia(String titulo){
		this.setTitulo(titulo);
	}
	
	// NOVO CONTRUTOR 2
	public Midia(String titulo, String genero){
		this(titulo); // chamada do construtor da propria classe
		this.setGenero(genero);
	}
	
	public Midia(String titulo, String genero, double preco){
		this(titulo, genero); // chamada do construtor da propria classe
		this.precoAluguel = preco;
	}
	
	// NOVO CONTRUTOR 4
	public Midia(String titulo, String genero, boolean alugada){
		this(titulo, genero); // chamada do construtor da propria classe
		this.alugada = alugada;
	}
	// NOVO CONTRUTOR 5 - PADRAO
	public Midia(){}
	
	//obriga as subclasses a reescrever o metodo!
	public abstract double calcularPrecoAluguel();
	
	public boolean isAlugada() {
		return alugada;
	}

	public void setAlugada(boolean alugada) {
		this.alugada = alugada;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	
	public void alugar() throws MidiaAlocadaException{
		if(alugada){
			MidiaAlocadaException exception = new MidiaAlocadaException("Midia já alugada!");
			throw exception;
		} else {
			alugada = true;
			System.out.println("Midia alugada com sucesso!");
		}
	}
	
	public void devolver() throws MidiaAlocadaException{
		if(!alugada){
			MidiaAlocadaException exception = new MidiaAlocadaException("Midia não está alugada!");
			throw exception;
		} else {
			alugada = false;
			System.out.println("Midia devolvida com sucesso!");
		}
	}
	
	public String estaAlugada() {		
		if(alugada){
			return "Sim";
		} else {
			return "Não";
		}		
	}

	public void setTitulo(String nome) {
		if(nome != null){
			titulo = nome;
		} else {
			System.out.println("Titulo inválido!");
		}
		
	}

	void setGenero(String gen) {
		this.genero = gen;
	}	
	
	@Override
	public String toString(){
		return "Titulo: " + this.titulo + "\n" +
				"Genero: " + this.genero + "\n" +
				"Aluguel: " + this.calcularPrecoAluguel() + "\n" +
				"Alugada? " + this.estaAlugada() + "\n";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Midia other = (Midia) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object o){
		Midia outra = (Midia) o;
		
		if(this.getTitulo().equalsIgnoreCase(outra.getTitulo()) && 
				this.getGenero().equalsIgnoreCase(outra.getGenero())){
			return true;
		}
		return false;
			
	}
	
	@Override
	public int hashCode(){
		return 0;
	}*/

	
	
}
