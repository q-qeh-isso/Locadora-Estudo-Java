public class Sorvete implements Negociavel{
	
	private String sabor;
	private String marca;	
	
	public Sorvete(String sabor, String marca){
		this.sabor = sabor;
		this.marca = marca;
	}
	
	@Override
	public String toString(){
		return "Sorvete\n" +
				"Sabor: " + this.sabor + "\n" +
				"Marca: " + this.marca;
	}
	
	@Override
	public double calcularPrecoVenda(){
		return Math.random() * 11;
	}

}
