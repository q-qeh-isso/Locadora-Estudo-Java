public class Jogo extends Midia implements Negociavel{

	private String console;
	

	public Jogo(String titulo, String genero, String console) {
		super(titulo, genero);
		this.setConsole(console);
	}
	
	public Jogo(String titulo, String genero, String console, double preco) {
		super(titulo, genero, preco);
		this.setConsole(console);
	}
	

	public Jogo() {}


	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		if(console != null){
			switch(console.toUpperCase()){
			case "XBOX": case "PS": case "ATARI":
				this.console = console;
				break;
			default:
				this.console = "INDEFINIDO";
			}
		}
	}
	
	@Override
	public double calcularPrecoAluguel() {
		return Midia.PRECO_MINIMO * 10;
	}
	
	@Override
	public String toString(){
		return "Jogo\n" +super.toString() +
				"Console: " + this.console;
	}
	
	@Override
	public void setGenero(String gen) {
		if(gen != null){
			switch(gen.toUpperCase()){
			case "ARCADE": 
			case "AVENTURA":
			case "TIRO":
			case "ESPORTE":
			case "INFANTIL":
			case "RPG":
			case "DANÇA":
			case "INDEFINIDO":
				super.setGenero(gen);
				break;
			default:
				System.out.println("Gênero inválido");
			}
		}
	}
	
	@Override
	public double calcularPrecoVenda(){
		return 5 * this.calcularPrecoAluguel();
	}
	
}
