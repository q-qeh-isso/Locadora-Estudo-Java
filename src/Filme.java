public class Filme extends Midia implements Negociavel{
	
	private String sinopse;
	

	
	public Filme(String titulo, String genero, String sinopse) {
		super(titulo, genero);
		this.setSinopse(sinopse);
	}
	public Filme(String titulo, String genero, String sinopse, double preco) {
		super(titulo, genero, preco);
		this.setSinopse(sinopse);
	}

	public Filme() {}

	public Filme(String titulo, String genero) {
		this.setTitulo(titulo);
		this.setGenero(genero);
	}
	
	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		if(sinopse != null){
			this.sinopse = sinopse;
		}
	}
	
	@Override
	public double calcularPrecoAluguel() {
		return Midia.PRECO_MINIMO * 2;
	}
	
	@Override
	public String toString(){
		return "Filme\n" + super.toString() +
				"Sinopse: " + this.sinopse;
	}
	
//	@Override
//	public void setGenero(String gen) {
//		if(gen != null){
//			switch(gen.toUpperCase()){
//			case "FICÇÃO": 
//			case "AVENTURA":
//			case "SUSPENSE":
//			case "TERROR":
//			case "DOCUMENTÁRIO":
//			case "COMÉDIA":
//			case "MUSICAL":
//			case "INFANTIL":
//			case "DRAMA":
//			case "SÉRIES":
//			case "INDEFINIDO":
//				super.setGenero(gen);
//				break;
//			default:
//				System.out.println("Gênero inválido");
//			}
//		}
//	}
	
	@Override
	public double calcularPrecoVenda(){
		return 3 * this.calcularPrecoAluguel();
	}

}
