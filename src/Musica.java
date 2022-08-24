public class Musica extends Midia{
	
	private String gravadora;

	public Musica(String titulo, String genero, String Gravadora){
		super(titulo,genero);
		this.setGravadora(gravadora);
	}
	public Musica(String titulo, String genero, String Gravadora, double preco){
		super(titulo,genero, preco);
		this.setGravadora(gravadora);
	}
	
	public Musica() {}
	
	
	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		if(gravadora != null){
			this.gravadora = gravadora;
		}
	}
	
	@Override
	public double calcularPrecoAluguel() {
		return Midia.PRECO_MINIMO * 4;
	}
	
	@Override
	public String toString(){
		return super.toString() +
				"Gravadora: " + this.gravadora;
	}
	
	@Override
	public void setGenero(String gen) {
		if(gen != null){
			switch(gen.toUpperCase()){
			case "SAMBA": 
			case "JAZZ":
			case "ROCK":
			case "TECHNO":
			case "MPB":
			case "POP":
			case "SERTANEJO":
			case "CLASSICO":
			case "INDEFINIDO":
				super.setGenero(gen);
				break;
			default:
				System.out.println("Gênero inválido");
			}
		}
	}

}
